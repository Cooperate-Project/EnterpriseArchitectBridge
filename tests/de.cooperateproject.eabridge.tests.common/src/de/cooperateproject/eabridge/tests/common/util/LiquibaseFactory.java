package de.cooperateproject.eabridge.tests.common.util;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.exception.LiquibaseException;
import liquibase.exception.ServiceNotFoundException;
import liquibase.logging.LogFactory;
import liquibase.logging.core.AbstractLogger;
import liquibase.resource.ClassLoaderResourceAccessor;
import liquibase.resource.FileSystemResourceAccessor;
import liquibase.servicelocator.LiquibaseService;
import liquibase.servicelocator.ServiceLocator;

public class LiquibaseFactory {
	
	private static boolean initialized = false;

	public static void init() {
		if (initialized) {
			return;
		}

		LogFactory.setInstance(new LiquibaseLogFactory());
		ServiceLocator.setInstance(new CustomizedServiceLocator());
		initialized = true;
	}
	
	public static Liquibase getInstance(TestResource changelog, Database database)
			throws LiquibaseException, IOException {
		init();
		return new Liquibase(changelog.getResourcePath(), new ClassLoaderResourceAccessor(changelog.getClassLoader()), database);
	}

	private static class LiquibaseLogFactory extends LogFactory {

		private static final AbstractLogger LOGGER = new LiquibaseLogger();
		
		@Override
		public liquibase.logging.Logger getLog(String name) {
			return getLog();
		}

		@Override
		public liquibase.logging.Logger getLog() {
			return LOGGER;
		}
		
	}
	
	public static class LiquibaseLogger extends AbstractLogger {

		private static final Logger LOGGER = LoggerFactory.getLogger(LiquibaseLogger.class);
		
		@Override
		public void setName(String name) {
		}

		@Override
		public void setLogLevel(String logLevel, String logFile) {
		}

		@Override
		public void severe(String message) {
			LOGGER.error(message);
		}

		@Override
		public void severe(String message, Throwable e) {
			LOGGER.error(message, e);
		}

		@Override
		public void warning(String message) {
			LOGGER.warn(message);
		}

		@Override
		public void warning(String message, Throwable e) {
			LOGGER.warn(message, e);
		}

		@Override
		public void info(String message) {
			LOGGER.info(message);
		}

		@Override
		public void info(String message, Throwable e) {
			LOGGER.info(message, e);
		}

		@Override
		public void debug(String message) {
			LOGGER.debug(message);
		}

		@Override
		public void debug(String message, Throwable e) {
			LOGGER.debug(message, e);
		}

		@Override
		public int getPriority() {
			return Integer.MAX_VALUE;
		}
		
	}
	
	@SuppressWarnings("rawtypes")
	private static class CustomizedServiceLocator extends ServiceLocator {

		private final Map<Class, List<Class>> classesBySuperclass = Maps.newHashMap();
		private static final Iterable<Class> liquibaseClasses = initClasses();

		@SuppressWarnings("unchecked")
		@Override
		public <T> Class<? extends T>[] findClasses(Class<T> requiredInterface) throws ServiceNotFoundException {
			List<Class> classes = getSubClasses(requiredInterface);
			return Sets.newHashSet(classes).toArray(new Class[0]);
		}

		private List<Class> getSubClasses(Class superclass) {
			if (!classesBySuperclass.containsKey(superclass)) {
				classesBySuperclass.put(superclass, findSubClasses(superclass));
			}
			return classesBySuperclass.get(superclass);
		}

		protected List<Class> findSubClasses(Class<?> superclass) {
			Iterable<Class> subclasses = Iterables.filter(liquibaseClasses,
					clz -> !Modifier.isInterface(clz.getModifiers()) && !Modifier.isAbstract(clz.getModifiers())
							&& Modifier.isPublic(clz.getModifiers()) && superclass.isAssignableFrom(clz)
							&& !(((Class<?>) clz).getAnnotation(LiquibaseService.class) != null
									&& ((Class<?>) clz).getAnnotation(LiquibaseService.class).skip()));
			subclasses = Iterables.filter(subclasses, new Predicate<Class>() {
				@Override
				public boolean apply(Class arg0) {
					try {
						((Class<?>)arg0).getConstructor();
					} catch (Exception e) {
						return false;
					}
					return true;
				}
			});
			return Lists.newArrayList(subclasses);
		}

		@SuppressWarnings("deprecation")
		private static Iterable<Class> initClasses() {
			return Arrays.asList(liquibase.sqlgenerator.SqlGeneratorChain.class,
					liquibase.database.core.MSSQLDatabase.class,
					liquibase.change.core.supplier.DropIndexChangeSupplier.class,
					liquibase.parser.NamespaceDetailsFactory.class, liquibase.lockservice.LockServiceFactory.class,
					liquibase.util.beans.FluentPropertyBeanIntrospector.class,
					liquibase.database.core.supplier.PostgresqlConnSupplier.class,
					liquibase.lockservice.StandardLockService.class,
					liquibase.sqlgenerator.core.AddColumnGenerator.class,
					liquibase.sqlgenerator.core.DropForeignKeyConstraintGenerator.class,
					liquibase.change.core.UpdateDataChange.class, liquibase.util.StringUtils.class,
					liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorPostgres.class,
					liquibase.statement.core.CreateProcedureStatement.class, liquibase.sqlgenerator.SqlGenerator.class,
					liquibase.serializer.ChangeLogSerializer.class, liquibase.sql.visitor.RegExpReplaceSqlVisitor.class,
					liquibase.statement.core.GetViewDefinitionStatement.class, liquibase.datatype.core.TimeType.class,
					liquibase.statement.core.DeleteStatement.class,
					liquibase.precondition.core.ObjectQuotingStrategyPrecondition.class,
					liquibase.diff.output.StandardObjectChangeFilter.class,
					liquibase.statement.core.SelectFromDatabaseChangeLogStatement.ByTag.class,
					liquibase.snapshot.SnapshotIdService.class, liquibase.sqlgenerator.SqlGeneratorFactory.class,
					liquibase.integration.commandline.Main.class,
					liquibase.precondition.core.ForeignKeyExistsPrecondition.class,
					liquibase.integration.commandline.CommandLineUtils.class,
					liquibase.sqlgenerator.core.AddAutoIncrementGeneratorHsqlH2.class,
					liquibase.logging.core.AbstractLogger.class, liquibase.changelog.RollbackContainer.class,
					liquibase.database.core.supplier.SybaseASAConnSupplier.class,
					liquibase.diff.ObjectDifferences.StandardCompareFunction.class,
					liquibase.sqlgenerator.core.RenameTableGenerator.class,
					liquibase.sql.visitor.PrependSqlVisitor.class, liquibase.sql.visitor.ReplaceSqlVisitor.class,
					liquibase.util.beans.BeanIntrospector.class,
					liquibase.sqlgenerator.core.CreateTableGeneratorInformix.class,
					liquibase.util.csv.opencsv.bean.HeaderColumnNameMappingStrategy.class,
					liquibase.statement.core.RemoveChangeSetRanStatusStatement.class,
					liquibase.change.core.RawSQLChange.class,
					liquibase.diff.output.changelog.core.MissingViewChangeGenerator.class,
					liquibase.sqlgenerator.core.RemoveChangeSetRanStatusGenerator.class,
					liquibase.precondition.CustomPreconditionWrapper.class,
					liquibase.sdk.supplier.change.ChangeSupplier.class,
					liquibase.changelog.filter.NotInChangeLogChangeSetFilter.class,
					liquibase.snapshot.jvm.SequenceSnapshotGenerator.class,
					liquibase.sqlgenerator.core.UnlockDatabaseChangeLogGenerator.class,
					liquibase.configuration.SystemPropertyProvider.class,
					liquibase.sdk.verifytest.TestPermutation.Invalid.class,
					liquibase.precondition.core.ChangeLogPropertyDefinedPrecondition.class,
					liquibase.sql.visitor.SqlVisitor.class,
					liquibase.change.core.supplier.DropColumnChangeSupplier.class,
					liquibase.change.core.supplier.LoadDataChangeSupplier.class,
					liquibase.lockservice.LockServiceImpl.class, liquibase.statement.core.RawCallStatement.class,
					liquibase.change.core.AddAutoIncrementChange.class,
					liquibase.change.core.AddForeignKeyConstraintChange.class,
					liquibase.diff.output.changelog.core.UnexpectedIndexChangeGenerator.class,
					liquibase.changelog.filter.ChangeSetFilterResult.class,
					liquibase.change.core.supplier.RawSQLChangeSupplier.class,
					liquibase.diff.ObjectDifferences.DataTypeCompareFunction.class,
					liquibase.change.core.SetTableRemarksChange.class,
					liquibase.change.core.ExecuteShellCommandChange.class,
					liquibase.sqlgenerator.core.RenameViewGenerator.class, liquibase.changelog.ChangeLogChild.class,
					liquibase.change.core.DeleteDataChange.class,
					liquibase.diff.compare.CompareControl.SchemaComparison.class,
					liquibase.precondition.core.PreconditionContainer.class, liquibase.datatype.core.TinyIntType.class,
					liquibase.statement.core.RenameViewStatement.class, liquibase.statement.core.RawSqlStatement.class,
					liquibase.executor.jvm.ColumnMapRowMapper.class, liquibase.diff.DiffResult.class,
					liquibase.change.core.supplier.DeleteDataChangeSupplier.class, liquibase.sql.UnparsedSql.class,
					liquibase.snapshot.jvm.UniqueConstraintSnapshotGenerator.class,
					liquibase.precondition.PreconditionLogic.class, liquibase.changelog.RanChangeSet.class,
					liquibase.util.beans.IntrospectionContext.class,
					liquibase.database.core.supplier.MySQLConnSupplier.class,
					liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorHsql.class,
					liquibase.change.core.supplier.DropNotNullConstraintChangeSupplier.class,
					liquibase.util.XMLUtil.class, liquibase.parser.ChangeLogParser.class,
					liquibase.statement.core.ReindexStatement.class,
					liquibase.sqlgenerator.core.AddUniqueConstraintGeneratorInformix.class,
					liquibase.diff.output.changelog.core.MissingPrimaryKeyChangeGenerator.class,
					liquibase.statement.core.DropProcedureStatement.class,
					liquibase.change.core.supplier.DropTableChangeSupplier.class, liquibase.database.Database.class,
					liquibase.statement.core.DropForeignKeyConstraintStatement.class,
					liquibase.diff.output.changelog.core.ChangedPrimaryKeyChangeGenerator.class,
					liquibase.parser.core.json.JsonSnapshotParser.class,
					liquibase.statement.core.FindForeignKeyConstraintsStatement.class,
					liquibase.parser.core.yaml.YamlParser.class, liquibase.change.core.DropViewChange.class,
					liquibase.sqlgenerator.core.StoredProcedureGenerator.class,
					liquibase.dbdoc.ChangeLogListWriter.class,
					liquibase.change.core.supplier.CreateViewChangeSupplier.class,
					liquibase.change.core.DropIndexChange.class, liquibase.changelog.filter.RanChangeSetFilter.class,
					liquibase.configuration.AbstractConfigurationContainer.class,
					liquibase.sqlgenerator.core.GetViewDefinitionGeneratorDerby.class,
					liquibase.sqlgenerator.core.GetViewDefinitionGeneratorPostgres.class,
					liquibase.diff.compare.core.TableComparator.class, liquibase.statement.core.CopyRowsStatement.class,
					liquibase.structure.core.StoredDatabaseLogic.class,
					liquibase.changelog.StandardChangeLogHistoryService.class,
					liquibase.sqlgenerator.core.AddDefaultValueGeneratorOracle.class,
					liquibase.change.core.RenameSequenceChange.class, liquibase.util.csv.CSVWriter.class,
					liquibase.LabelExpression.class, liquibase.sqlgenerator.core.LockDatabaseChangeLogGenerator.class,
					liquibase.diff.output.changelog.core.ChangedTableChangeGenerator.class,
					liquibase.changelog.filter.AfterTagChangeSetFilter.class, liquibase.Liquibase.class,
					liquibase.datatype.core.BooleanType.class, liquibase.resource.ResourceAccessor.class,
					liquibase.sqlgenerator.core.InsertOrUpdateGeneratorMSSQL.class,
					liquibase.change.core.AddLookupTableChange.class, liquibase.util.xml.DefaultXmlWriter.class,
					liquibase.sql.visitor.AbstractSqlVisitor.class,
					liquibase.configuration.LiquibaseConfiguration.class, liquibase.util.csv.opencsv.CSVWriter.class,
					liquibase.change.core.CreateTableChange.class, liquibase.database.core.DerbyDatabase.class,
					liquibase.sdk.database.MockDatabase.class, liquibase.changelog.ChangeLogHistoryServiceFactory.class,
					liquibase.sqlgenerator.core.DropDefaultValueGenerator.class,
					liquibase.diff.output.changelog.core.UnexpectedUniqueConstraintChangeGenerator.class,
					liquibase.diff.output.changelog.core.MissingTableChangeGenerator.class,
					liquibase.change.core.supplier.DropViewChangeSupplier.class,
					liquibase.command.CommandValidationErrors.class, liquibase.change.core.MergeColumnChange.class,
					liquibase.util.MD5Util.class, liquibase.diff.output.changelog.core.ChangedViewChangeGenerator.class,
					liquibase.sqlgenerator.core.AddAutoIncrementGeneratorSQLite.class,
					liquibase.diff.output.changelog.UnexpectedObjectChangeGenerator.class,
					liquibase.sqlgenerator.core.RawSqlGenerator.class,
					liquibase.diff.compare.core.IndexComparator.class,
					liquibase.statement.core.DropColumnStatement.class,
					liquibase.statement.core.SetTableRemarksStatement.class, liquibase.parser.LiquibaseParser.class,
					liquibase.servicelocator.ServiceLocator.class,
					liquibase.changelog.filter.ActuallyExecutedChangeSetFilter.class,
					liquibase.change.core.supplier.UpdateDataChangeSupplier.class,
					liquibase.diff.output.changelog.core.ChangedUniqueConstraintChangeGenerator.class,
					liquibase.change.core.ModifyDataTypeChange.class,
					liquibase.statement.core.InsertOrUpdateStatement.class, liquibase.executor.jvm.RowMapper.class,
					liquibase.database.InternalDatabase.class,
					liquibase.servicelocator.DefaultPackageScanClassResolver.class,
					liquibase.sqlgenerator.core.UpdateDataChangeGenerator.class,
					liquibase.change.custom.CustomChangeWrapper.class, liquibase.datatype.core.NCharType.class,
					liquibase.sqlgenerator.core.SelectFromDatabaseChangeLogGenerator.class,
					liquibase.change.ConstraintsConfig.class,
					liquibase.statement.UpdateExecutablePreparedStatement.class,
					liquibase.statement.core.TagDatabaseStatement.class,
					liquibase.statement.core.AddPrimaryKeyStatement.class,
					liquibase.sqlgenerator.core.DropSequenceGenerator.class,
					liquibase.sdk.verifytest.TestPermutation.Value.class, liquibase.database.jvm.SybaseConnection.class,
					liquibase.executor.ExecutorService.class, liquibase.snapshot.jvm.H2ColumnSnapshotGenerator.class,
					liquibase.change.AbstractSQLChange.class, liquibase.database.jvm.JdbcConnection.class,
					liquibase.change.core.supplier.SQLFileChangeSupplier.class,
					liquibase.sqlgenerator.core.DropViewGenerator.class,
					liquibase.statement.core.AlterSequenceStatement.class, liquibase.logging.Logger.class,
					liquibase.statement.core.SetColumnRemarksStatement.class,
					liquibase.changelog.visitor.ChangeExecListener.class, liquibase.parser.SnapshotParser.class,
					liquibase.snapshot.jvm.DataSnapshotGenerator.class,
					liquibase.sqlgenerator.core.SetNullableGenerator.class,
					liquibase.sdk.verifytest.OutputFormat.ArrayFormat.class, liquibase.change.core.OutputChange.class,
					liquibase.resource.FileSystemResourceAccessor.class,
					liquibase.sqlgenerator.core.InsertOrUpdateGeneratorHsql.class,
					liquibase.command.AbstractCommand.class, liquibase.structure.core.Schema.class,
					liquibase.structure.core.UniqueConstraint.class, liquibase.diff.output.report.DiffToReport.class,
					liquibase.statement.SequenceNextValueFunction.class,
					liquibase.diff.ObjectDifferences.CompareFunction.class,
					liquibase.sqlgenerator.core.ReindexGeneratorSQLite.class, liquibase.util.JdbcUtils.class,
					liquibase.change.core.supplier.EmptyChangeSupplier.class,
					liquibase.changelog.visitor.StatusVisitor.class,
					liquibase.changelog.filter.CountChangeSetFilter.class,
					liquibase.sdk.verifytest.TestPermutation.class,
					liquibase.diff.output.changelog.core.UnexpectedViewChangeGenerator.class,
					liquibase.change.core.supplier.InsertDataChangeSupplier.class,
					liquibase.changelog.visitor.ChangeLogSyncListener.class,
					liquibase.snapshot.jvm.CatalogSnapshotGenerator.class,
					liquibase.sdk.resource.MockResourceAccessor.class,
					liquibase.sqlgenerator.core.InsertOrUpdateGeneratorH2.class,
					liquibase.util.beans.PropertyUtils.class, liquibase.util.StreamUtil.class,
					liquibase.diff.compare.DatabaseObjectComparator.class, liquibase.changelog.ChangeLogInclude.class,
					liquibase.parser.NamespaceDetails.class,
					liquibase.sqlgenerator.core.AddForeignKeyConstraintGenerator.class,
					liquibase.statement.NotNullConstraint.class,
					liquibase.diff.output.changelog.ChangeGeneratorFactory.class,
					liquibase.precondition.core.IndexExistsPrecondition.class,
					liquibase.changelog.ChangeLogIncludeAll.class, liquibase.database.DatabaseConnection.class,
					liquibase.sqlgenerator.core.DropTableGenerator.class,
					liquibase.sqlgenerator.core.InsertOrUpdateGeneratorPostgres.class,
					liquibase.executor.AbstractExecutor.class,
					liquibase.precondition.core.TableExistsPrecondition.class,
					liquibase.statement.core.UpdateChangeSetChecksumStatement.class,
					liquibase.precondition.Precondition.class,
					liquibase.statement.InsertExecutablePreparedStatement.class,
					liquibase.database.core.SQLiteDatabase.AlterTableVisitor.class,
					liquibase.dbdoc.TableListWriter.class, liquibase.diff.compare.DatabaseObjectComparatorFactory.class,
					liquibase.change.custom.CustomTaskRollback.class,
					liquibase.sqlgenerator.core.AddDefaultValueGeneratorDerby.class,
					liquibase.database.core.supplier.H2ConnSupplier.class,
					liquibase.sqlgenerator.core.ClearDatabaseChangeLogTableGenerator.class,
					liquibase.diff.compare.core.ColumnComparator.class,
					liquibase.snapshot.RestoredDatabaseSnapshot.class, liquibase.sql.Sql.class,
					liquibase.change.core.supplier.CreateProcedureChangeSupplier.class,
					liquibase.statement.core.AddDefaultValueStatement.class,
					liquibase.sqlgenerator.core.AddPrimaryKeyGeneratorInformix.class,
					liquibase.change.core.StopChange.class, liquibase.statement.SqlStatement.class,
					liquibase.changelog.filter.NotRanChangeSetFilter.class, liquibase.snapshot.SnapshotGenerator.class,
					liquibase.diff.output.DiffOutputControl.class,
					liquibase.changelog.AbstractChangeLogHistoryService.class,
					liquibase.change.core.supplier.AddForeignKeyConstraintChangeSupplier.class,
					liquibase.database.core.SybaseASADatabase.class, liquibase.common.datatype.DataTypeWrapper.class,
					liquibase.serializer.LiquibaseSerializable.class, liquibase.executor.LoggingExecutor.class,
					liquibase.change.CheckSum.class, liquibase.sqlgenerator.core.AddAutoIncrementGeneratorDB2.class,
					liquibase.datatype.core.DatabaseFunctionType.class,
					liquibase.sqlgenerator.core.SelectFromDatabaseChangeLogLockGenerator.class,
					liquibase.diff.ObjectDifferences.DatabaseObjectNameCompareFunction.class,
					liquibase.sqlgenerator.core.GetViewDefinitionGeneratorOracle.class,
					liquibase.diff.output.changelog.core.UnexpectedColumnChangeGenerator.class,
					liquibase.changelog.visitor.RollbackVisitor.class, liquibase.change.custom.CustomSqlChange.class,
					liquibase.sqlgenerator.core.DropColumnGenerator.class, liquibase.dbdoc.HTMLListWriter.class,
					liquibase.servicelocator.LiquibaseService.class, liquibase.sdk.verifytest.VerifiedTest.class,
					liquibase.change.ChangeParameterMetaData.class, liquibase.util.xml.XmlWriter.class,
					liquibase.util.ui.UIFactory.class, liquibase.structure.DatabaseObjectComparator.class,
					liquibase.datatype.core.UnknownType.class, liquibase.serializer.AbstractLiquibaseSerializable.class,
					liquibase.snapshot.jvm.IndexSnapshotGenerator.class,
					liquibase.database.core.supplier.OracleConnSupplier.class,
					liquibase.change.core.DropTableChange.class,
					liquibase.sqlgenerator.core.DropUniqueConstraintGenerator.class,
					liquibase.change.core.supplier.ModifyDataTypeChangeSupplier.class,
					liquibase.sqlgenerator.core.AddAutoIncrementGeneratorInformix.class,
					liquibase.precondition.core.RunningAsPrecondition.class,
					liquibase.changelog.filter.LabelChangeSetFilter.class, liquibase.sdk.executor.MockExecutor.class,
					liquibase.statement.core.CreateTableStatement.class,
					liquibase.serializer.SnapshotSerializerFactory.class,
					liquibase.statement.core.InitializeDatabaseChangeLogLockTableStatement.class,
					liquibase.diff.output.changelog.core.MissingIndexChangeGenerator.class,
					liquibase.statement.core.DropTableStatement.class,
					liquibase.configuration.GlobalConfiguration.class, liquibase.database.jvm.HsqlConnection.class,
					liquibase.change.core.DropNotNullConstraintChange.class,
					liquibase.serializer.core.string.StringSnapshotSerializer.class,
					liquibase.servicelocator.CustomResolverServiceLocator.class, liquibase.change.AbstractChange.class,
					liquibase.change.DatabaseChangeProperty.class, liquibase.snapshot.jvm.TableSnapshotGenerator.class,
					liquibase.change.ChangeStatus.class, liquibase.sql.SingleLineComment.class,
					liquibase.database.core.HsqlDatabase.class,
					liquibase.sqlgenerator.core.InitializeDatabaseChangeLogLockTableGenerator.class,
					liquibase.statement.core.SelectFromDatabaseChangeLogLockStatement.class,
					liquibase.statement.core.SelectFromDatabaseChangeLogStatement.class,
					liquibase.sqlgenerator.core.DeleteGenerator.class, liquibase.structure.core.Column.class,
					liquibase.sdk.verifytest.TestPermutation.CannotVerify.class,
					liquibase.change.DbmsTargetedChange.class, liquibase.statement.AbstractSqlStatement.class,
					liquibase.sqlgenerator.core.AddColumnGeneratorDefaultClauseBeforeNotNull.class,
					liquibase.sqlgenerator.core.RenameColumnGenerator.class,
					liquibase.statement.core.ModifyDataTypeStatement.class,
					liquibase.statement.core.GetNextChangeSetSequenceValueStatement.class,
					liquibase.statement.core.DropIndexStatement.class, liquibase.precondition.Conditional.class,
					liquibase.statement.StoredProcedureStatement.class,
					liquibase.sqlgenerator.core.AddUniqueConstraintGeneratorTDS.class,
					liquibase.datatype.core.DateTimeType.class, liquibase.sqlgenerator.core.DropIndexGenerator.class,
					liquibase.change.core.TagDatabaseChange.class, liquibase.util.ui.UIFacade.class,
					liquibase.sqlgenerator.core.InsertGenerator.class, liquibase.structure.CatalogLevelObject.class,
					liquibase.structure.core.View.class, liquibase.statement.DatabaseFunction.class,
					liquibase.structure.DatabaseLevelObject.class,
					liquibase.diff.compare.core.DefaultDatabaseObjectComparator.class,
					liquibase.sqlgenerator.core.GetViewDefinitionGeneratorHsql.class,
					liquibase.structure.DatabaseObject.class, liquibase.changelog.filter.ChangeSetFilter.class,
					liquibase.changelog.filter.ExecutedAfterChangeSetFilter.class,
					liquibase.change.core.supplier.LoadUpdateDataChangeSupplier.class,
					liquibase.diff.compare.core.CatalogComparator.class,
					liquibase.database.core.supplier.FirebirdConnSupplier.class, liquibase.snapshot.CachedRow.class,
					liquibase.change.core.supplier.RenameSequenceChangeSupplier.class,
					liquibase.diff.core.StandardDiffGenerator.class, liquibase.database.core.H2Database.class,
					liquibase.util.csv.CSVReader.class,
					liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorFirebird.class,
					liquibase.diff.output.changelog.core.MissingForeignKeyChangeGenerator.class,
					liquibase.changelog.visitor.ValidatingVisitor.class,
					liquibase.util.csv.opencsv.bean.HeaderColumnNameTranslateMappingStrategy.class,
					liquibase.statement.core.CommentStatement.class,
					liquibase.statement.core.UnlockDatabaseChangeLogStatement.class,
					liquibase.change.core.supplier.TagDatabaseChangeSupplier.class,
					liquibase.change.core.CreateIndexChange.class,
					liquibase.sqlgenerator.core.ModifyDataTypeGenerator.class,
					liquibase.database.core.PostgresDatabase.class,
					liquibase.util.StringUtils.StringUtilsFormatter.class, liquibase.datatype.DataTypeInfo.class,
					liquibase.logging.core.DefaultLoggerConfiguration.class,
					liquibase.statement.core.AddForeignKeyConstraintStatement.class,
					liquibase.changelog.visitor.SkippedChangeSetVisitor.class,
					liquibase.sdk.verifytest.TestPermutation.Verification.class,
					liquibase.change.core.RenameColumnChange.class, liquibase.statement.core.DropViewStatement.class,
					liquibase.datatype.core.BlobType.class, liquibase.statement.core.RenameTableStatement.class,
					liquibase.sqlgenerator.core.MarkChangeSetRanGenerator.class,
					liquibase.database.core.InformixDatabase.class,
					liquibase.precondition.core.PrimaryKeyExistsPrecondition.class,
					liquibase.sqlgenerator.core.SetColumnRemarksGenerator.class,
					liquibase.parser.core.xml.AbstractChangeLogParser.class, liquibase.util.NetUtil.class,
					liquibase.change.core.SQLFileChange.class,
					liquibase.change.core.supplier.RenameColumnChangeSupplier.class,
					liquibase.statement.core.SelectFromDatabaseChangeLogStatement.ByNotNullCheckSum.class,
					liquibase.database.core.MariaDBDatabase.class,
					liquibase.servicelocator.CompositePackageScanFilter.class,
					liquibase.change.core.DropUniqueConstraintChange.class,
					liquibase.sqlgenerator.core.InsertDataChangeGenerator.class,
					liquibase.change.core.supplier.CreateTableChangeSupplier.class,
					liquibase.sdk.supplier.database.CoreDatabases.class, liquibase.util.SqlUtil.class,
					liquibase.diff.output.changelog.ChangeGeneratorComparator.class,
					liquibase.change.core.supplier.StopChangeSupplier.class,
					liquibase.servicelocator.AssignableToPackageScanFilter.class,
					liquibase.command.LiquibaseCommand.class,
					liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorMySQL.class,
					liquibase.command.SnapshotCommand.class, liquibase.sqlgenerator.core.AddDefaultValueGenerator.class,
					liquibase.change.core.supplier.CreateSequenceChangeSupplier.class,
					liquibase.database.core.UnsupportedDatabase.class,
					liquibase.sqlgenerator.core.GetViewDefinitionGeneratorFirebird.class,
					liquibase.snapshot.jvm.ViewSnapshotGenerator.class, liquibase.database.core.MySQLDatabase.class,
					liquibase.datatype.core.SmallIntType.class,
					liquibase.diff.output.changelog.ChangedObjectChangeGenerator.class,
					liquibase.statement.PrimaryKeyConstraint.class,
					liquibase.snapshot.jvm.ColumnSnapshotGenerator.class,
					liquibase.sqlgenerator.core.CreateDatabaseChangeLogTableGeneratorSybase.class,
					liquibase.statement.core.InsertSetStatement.class, liquibase.change.core.CreateViewChange.class,
					liquibase.datatype.core.DecimalType.class,
					liquibase.sqlgenerator.core.GetViewDefinitionGeneratorSybase.class,
					liquibase.statement.core.DropDefaultValueStatement.class,
					liquibase.sqlgenerator.core.CreateTableGenerator.class, liquibase.command.ExecuteSqlCommand.class,
					liquibase.statement.core.LockDatabaseChangeLogStatement.class,
					liquibase.sqlgenerator.core.CreateIndexGeneratorPostgres.class,
					liquibase.sqlgenerator.core.ReorganizeTableGeneratorDB2.class,
					liquibase.changelog.filter.ContextChangeSetFilter.class,
					liquibase.snapshot.SnapshotGeneratorFactory.class,
					liquibase.sqlgenerator.core.UpdateGenerator.class,
					liquibase.sdk.verifytest.VerifiedTestReader.class, liquibase.change.core.DropPrimaryKeyChange.class,
					liquibase.change.core.LoadDataColumnConfig.class, liquibase.structure.core.StoredProcedure.class,
					liquibase.dbdoc.AuthorListWriter.class,
					liquibase.change.core.supplier.AddPrimaryKeyChangeSupplier.class, liquibase.ContextExpression.class,
					liquibase.diff.output.changelog.core.ChangedSequenceChangeGenerator.class,
					liquibase.precondition.PreconditionFactory.class, liquibase.statement.core.AddColumnStatement.class,
					liquibase.database.PreparedStatementFactory.class, liquibase.change.ChangeFactory.class,
					liquibase.diff.compare.core.UniqueConstraintComparator.class,
					liquibase.changelog.filter.AlreadyRanChangeSetFilter.class, liquibase.dbdoc.HTMLWriter.class,
					liquibase.database.core.FirebirdDatabase.class,
					liquibase.database.core.supplier.SybaseConnSupplier.class, liquibase.Contexts.class,
					liquibase.precondition.core.SequenceExistsPrecondition.class,
					liquibase.diff.output.changelog.core.MissingDataExternalFileChangeGenerator.class,
					liquibase.sqlgenerator.core.CreateProcedureGenerator.class,
					liquibase.change.core.supplier.AddColumnConfigSupplier.class,
					liquibase.sqlgenerator.core.InsertSetGenerator.class,
					liquibase.statement.core.InsertStatement.class, liquibase.precondition.AbstractPrecondition.class,
					liquibase.sqlgenerator.core.AddDefaultValueGeneratorSybaseASA.class,
					liquibase.change.custom.CustomSqlRollback.class,
					liquibase.configuration.ConfigurationProperty.class,
					liquibase.statement.core.DropSequenceStatement.class,
					liquibase.changelog.filter.DbmsChangeSetFilter.class, liquibase.datatype.DatabaseDataType.class,
					liquibase.diff.compare.core.ForeignKeyComparator.class,
					liquibase.change.core.supplier.RenameViewChangeSupplier.class,
					liquibase.parser.ChangeLogParserCofiguration.class,
					liquibase.changelog.ChangeLogHistoryService.class,
					liquibase.serializer.ChangeLogSerializerFactory.class,
					liquibase.change.core.supplier.ExecuteShellCommandChangeSupplier.class,
					liquibase.sqlgenerator.core.AddDefaultValueGeneratorMSSQL.class, liquibase.diff.DiffGenerator.class,
					liquibase.parser.core.sql.SqlChangeLogParser.class,
					liquibase.change.core.supplier.AddNotNullConstraintChangeSupplier.class,
					liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorOracle.class,
					liquibase.sqlgenerator.core.CopyRowsGenerator.class, liquibase.datatype.core.FloatType.class,
					liquibase.parser.SnapshotParserFactory.class,
					liquibase.sqlgenerator.core.AddUniqueConstraintGenerator.class,
					liquibase.statement.core.DropPrimaryKeyStatement.class,
					liquibase.sqlgenerator.core.AddDefaultValueGeneratorSybase.class,
					liquibase.sqlgenerator.core.GetViewDefinitionGeneratorInformix.class,
					liquibase.sqlgenerator.core.AddDefaultValueGeneratorInformix.class,
					liquibase.diff.output.changelog.core.MissingDataChangeGenerator.class,
					liquibase.change.core.SetColumnRemarksChange.class,
					liquibase.precondition.core.ColumnExistsPrecondition.class, liquibase.structure.core.Catalog.class,
					liquibase.sql.visitor.AppendSqlVisitor.class, liquibase.serializer.SnapshotSerializer.class,
					liquibase.parser.core.ParsedNode.class, liquibase.change.core.LoadUpdateDataChange.class,
					liquibase.statement.core.ReorganizeTableStatement.class,
					liquibase.precondition.core.OrPrecondition.class, liquibase.changelog.ChangeSet.class,
					liquibase.sqlgenerator.core.AddPrimaryKeyGenerator.class,
					liquibase.sqlgenerator.core.CreateIndexGenerator.class, liquibase.executor.jvm.JdbcExecutor.class,
					liquibase.diff.ObjectDifferences.class, liquibase.dbdoc.PendingChangesWriter.class,
					liquibase.command.GenerateChangeLogCommand.class,
					liquibase.sdk.verifytest.TestPermutation.SetupResult.class,
					liquibase.datatype.core.NVarcharType.class, liquibase.snapshot.EmptyDatabaseSnapshot.class,
					liquibase.sdk.verifytest.OutputFormat.class, liquibase.util.file.FilenameUtils.class,
					liquibase.sqlgenerator.core.AbstractSqlGenerator.class, liquibase.lockservice.LockService.class,
					liquibase.sqlgenerator.core.GetNextChangeSetSequenceValueGenerator.class,
					liquibase.change.core.AddDefaultValueChange.class,
					liquibase.diff.output.changelog.core.ChangedColumnChangeGenerator.class,
					liquibase.precondition.CustomPrecondition.class,
					liquibase.statement.core.SelectFromDatabaseChangeLogStatement.WhereClause.class,
					liquibase.util.beans.DefaultBeanIntrospector.class,
					liquibase.statement.AutoIncrementConstraint.class, liquibase.structure.core.Index.class,
					liquibase.diff.ObjectDifferences.OrderedCollectionCompareFunction.class,
					liquibase.sdk.vagrant.VagrantCommand.class,
					liquibase.sqlgenerator.core.CreateDatabaseChangeLogTableGenerator.class,
					liquibase.statement.ExecutablePreparedStatementBase.class,
					liquibase.sqlgenerator.core.UpdateChangeSetChecksumGenerator.class,
					liquibase.changelog.ChangeLogParameters.class, liquibase.util.LiquibaseUtil.class,
					liquibase.sqlgenerator.core.AddDefaultValueSQLite.class,
					liquibase.sqlgenerator.core.RenameSequenceGenerator.class,
					liquibase.precondition.core.RowCountPrecondition.class,
					liquibase.diff.output.changelog.core.UnexpectedTableChangeGenerator.class,
					liquibase.precondition.FailedPrecondition.class,
					liquibase.statement.core.MarkChangeSetRanStatement.class,
					liquibase.diff.output.changelog.ChangeGeneratorChain.class,
					liquibase.statement.core.TableRowCountStatement.class,
					liquibase.statement.core.AddAutoIncrementStatement.class,
					liquibase.sqlgenerator.core.CreateDatabaseChangeLogLockTableGenerator.class,
					liquibase.sqlgenerator.core.DropProcedureGenerator.class,
					liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorMSSQL.class,
					liquibase.datatype.core.XMLType.class, liquibase.datatype.core.TimestampType.class,
					liquibase.parser.core.xml.LiquibaseEntityResolver.class, liquibase.snapshot.SnapshotListener.class,
					liquibase.structure.AbstractDatabaseObject.class, liquibase.database.jvm.DerbyConnection.class,
					liquibase.sqlgenerator.core.CommentGenerator.class,
					liquibase.database.core.supplier.InformixConnSupplier.class,
					liquibase.database.core.supplier.DB2ConnSupplier.class,
					liquibase.change.core.supplier.DropDefaultValueChangeSupplier.class,
					liquibase.serializer.core.string.StringChangeLogSerializer.FieldFilter.class,
					liquibase.util.BooleanParser.class,
					liquibase.diff.output.changelog.core.UnexpectedForeignKeyChangeGenerator.class,
					liquibase.dbdoc.TableWriter.class, liquibase.change.core.supplier.DropSequenceChangeSupplier.class,
					liquibase.database.core.SybaseDatabase.class, liquibase.change.custom.CustomTaskChange.class,
					liquibase.logging.LogFactory.class,
					liquibase.sqlgenerator.core.AddAutoIncrementGeneratorMySQL.class,
					liquibase.util.csv.opencsv.bean.ColumnPositionMappingStrategy.class,
					liquibase.sqlgenerator.core.GetViewDefinitionGeneratorMSSQL.class, liquibase.util.ObjectUtil.class,
					liquibase.precondition.core.ViewExistsPrecondition.class, liquibase.sdk.Context.class,
					liquibase.parser.core.xml.StandardNamespaceDetails.class,
					liquibase.statement.core.RenameSequenceStatement.class, liquibase.datatype.core.DateType.class,
					liquibase.lockservice.DatabaseChangeLogLock.class,
					liquibase.resource.AbstractResourceAccessor.class, liquibase.database.core.DB2Database.class,
					liquibase.command.DiffToChangeLogCommand.class, liquibase.changelog.ChangeLogProperty.class,
					liquibase.precondition.core.SqlPrecondition.class,
					liquibase.integration.ant.type.ChangeLogOutputFile.class,
					liquibase.sqlgenerator.core.AddColumnGeneratorSQLite.class,
					liquibase.change.core.supplier.DropProcedureChangeSupplier.class,
					liquibase.dbdoc.AuthorWriter.class,
					liquibase.change.core.supplier.DropPrimaryKeyChangeSupplier.class,
					liquibase.datatype.core.IntType.class, liquibase.changelog.visitor.DBDocVisitor.class,
					liquibase.structure.core.Table.class, liquibase.database.core.supplier.SQLiteConnSupplier.class,
					liquibase.database.OfflineConnection.class, liquibase.diff.StringDiff.class,
					liquibase.change.core.DropForeignKeyConstraintChange.class,
					liquibase.change.core.DropProcedureChange.class,
					liquibase.diff.output.changelog.core.MissingColumnChangeGenerator.class,
					liquibase.changelog.visitor.UpdateVisitor.class, liquibase.change.DatabaseChangeNote.class,
					liquibase.structure.core.DatabaseObjectFactory.class,
					liquibase.statement.core.CreateDatabaseChangeLogTableStatement.class,
					liquibase.util.SystemUtils.class, liquibase.diff.compare.CompareControl.class,
					liquibase.sqlgenerator.core.DropPrimaryKeyGenerator.class,
					liquibase.change.core.supplier.AddUniqueConstraintChangeSupplier.class,
					liquibase.precondition.core.AndPrecondition.class,
					liquibase.sqlgenerator.core.CreateViewGeneratorInformix.class,
					liquibase.statement.core.RuntimeStatement.class,
					liquibase.changelog.visitor.ChangeLogSyncVisitor.class,
					liquibase.diff.compare.core.SchemaComparator.class,
					liquibase.serializer.core.formattedsql.FormattedSqlChangeLogSerializer.class,
					liquibase.command.DiffCommand.class, liquibase.datatype.core.NumberType.class,
					liquibase.change.core.RenameViewChange.class, liquibase.changelog.IncludeAllFilter.class,
					liquibase.change.core.InsertDataChange.class, liquibase.serializer.ReflectionSerializer.class,
					liquibase.diff.compare.DatabaseObjectComparatorChain.class,
					liquibase.statement.core.CreateDatabaseChangeLogLockTableStatement.class,
					liquibase.sdk.verifytest.OutputFormat.CollectionFormat.class,
					liquibase.diff.ObjectDifferences.ToStringCompareFunction.class,
					liquibase.diff.output.changelog.DiffToChangeLog.class, liquibase.diff.DiffGeneratorFactory.class,
					liquibase.change.core.supplier.DropAllForeignKeyConstraintsChangeSupplier.class,
					liquibase.snapshot.SnapshotGeneratorChain.class, liquibase.snapshot.SnapshotControl.class,
					liquibase.snapshot.jvm.SchemaSnapshotGenerator.class,
					liquibase.change.core.CreateProcedureChange.class,
					liquibase.precondition.core.NotPrecondition.class,
					liquibase.sqlgenerator.core.GetViewDefinitionGeneratorSybaseASA.class,
					liquibase.change.ChangeWithColumns.class, liquibase.configuration.ConfigurationValueProvider.class,
					liquibase.CatalogAndSchema.class, liquibase.structure.core.Data.class,
					liquibase.sqlgenerator.core.TableRowCountGenerator.class, liquibase.diff.DiffStatusListener.class,
					liquibase.database.core.supplier.DerbyConnSupplier.class,
					liquibase.diff.output.changelog.core.MissingSequenceChangeGenerator.class,
					liquibase.sqlgenerator.core.InsertOrUpdateGeneratorDB2.class, liquibase.executor.Executor.class,
					liquibase.snapshot.DatabaseSnapshot.class, liquibase.changelog.filter.UpToTagChangeSetFilter.class,
					liquibase.database.core.OracleDatabase.class, liquibase.sqlgenerator.core.CreateViewGenerator.class,
					liquibase.datatype.core.BigIntType.class, liquibase.change.core.AddColumnChange.class,
					liquibase.parser.core.xml.XMLChangeLogSAXParser.class,
					liquibase.sqlgenerator.core.InsertOrUpdateGenerator.class,
					liquibase.sqlgenerator.core.AlterSequenceGenerator.class,
					liquibase.diff.output.changelog.ChangeGenerator.class,
					liquibase.serializer.core.xml.XMLChangeLogSerializer.class,
					liquibase.precondition.core.TableIsEmptyPrecondition.class,
					liquibase.change.custom.supplier.CustomChangeWrapperSupplier.class,
					liquibase.change.ColumnConfig.class, liquibase.change.core.AddUniqueConstraintChange.class,
					liquibase.change.core.supplier.DropUniqueConstraintChangeSupplier.class,
					liquibase.statement.SequenceCurrentValueFunction.class,
					liquibase.statement.core.CreateSequenceStatement.class,
					liquibase.change.core.supplier.RenameTableChangeSupplier.class,
					liquibase.util.ui.SwingUIFacade.class, liquibase.changelog.visitor.ChangeSetVisitor.class,
					liquibase.sqlgenerator.core.GetViewDefinitionGeneratorDB2.class,
					liquibase.snapshot.jvm.JdbcSnapshotGenerator.class,
					liquibase.serializer.core.string.StringSnapshotSerializerReadable.class,
					liquibase.executor.jvm.RowMapperResultSetExtractor.class, liquibase.util.NumberUtils.class,
					liquibase.change.core.supplier.AddColumnChangeSupplier.class,
					liquibase.lockservice.OfflineLockService.class,
					liquibase.diff.output.changelog.core.ChangedForeignKeyChangeGenerator.class,
					liquibase.sdk.verifytest.TestPermutation.Cleanup.class, liquibase.changelog.ChangeLogIterator.class,
					liquibase.database.DatabaseFactory.class, liquibase.datatype.core.MediumIntType.class,
					liquibase.diff.output.changelog.core.UnexpectedSequenceChangeGenerator.class,
					liquibase.statement.core.CreateIndexStatement.class,
					liquibase.change.core.supplier.AddLookupTableChangeSupplier.class,
					liquibase.sdk.verifytest.TestPermutation.Setup.class, liquibase.dbdoc.RecentChangesWriter.class,
					liquibase.change.core.AlterSequenceChange.class, liquibase.serializer.LiquibaseSerializer.class,
					liquibase.sdk.supplier.change.ChangeSupplierFactory.class,
					liquibase.diff.output.ObjectChangeFilter.class,
					liquibase.statement.core.ClearDatabaseChangeLogTableStatement.class,
					liquibase.exception.Warnings.class, liquibase.parser.core.json.JsonChangeLogParser.class,
					liquibase.util.csv.opencsv.CSVReader.class, liquibase.structure.core.ForeignKey.class,
					liquibase.statement.CallableSqlStatement.class,
					liquibase.changelog.filter.ShouldRunChangeSetFilter.class,
					liquibase.sqlgenerator.core.InsertOrUpdateGeneratorOracle.class,
					liquibase.sqlgenerator.core.AddDefaultValueGeneratorMySQL.class,
					liquibase.change.core.AbstractModifyDataChange.class, liquibase.change.DatabaseChange.class,
					liquibase.change.ChangeMetaData.class, liquibase.sdk.verifytest.VerifiedTestWriter.class,
					liquibase.resource.CompositeResourceAccessor.class,
					liquibase.diff.output.changelog.core.UnexpectedPrimaryKeyChangeGenerator.class,
					liquibase.statement.core.RenameColumnStatement.class, liquibase.change.Change.class,
					liquibase.parser.core.yaml.YamlSnapshotParser.class,
					liquibase.integration.ant.type.ConnectionProperties.class,
					liquibase.datatype.core.VarcharType.class, liquibase.logging.core.DefaultLogger.class,
					liquibase.servicelocator.WebSpherePackageScanClassResolver.class,
					liquibase.util.ISODateFormat.class, liquibase.structure.core.Sequence.class,
					liquibase.util.csv.opencsv.bean.CsvToBean.class, liquibase.change.custom.CustomChange.class,
					liquibase.util.csv.opencsv.bean.MappingStrategy.class, liquibase.dbdoc.ColumnWriter.class,
					liquibase.change.core.supplier.AddAutoIncrementChangeSupplier.class,
					liquibase.change.core.supplier.AddDefaultValueChangeSupplier.class,
					liquibase.sqlgenerator.core.CreateSequenceGenerator.class, liquibase.Labels.class,
					liquibase.parser.core.formattedsql.FormattedSqlChangeLogParser.class,
					liquibase.diff.ObjectDifferences.UnOrderedCollectionCompareFunction.class,
					liquibase.snapshot.JdbcDatabaseSnapshot.CachingDatabaseMetaData.class,
					liquibase.change.core.DropColumnChange.class,
					liquibase.sqlgenerator.core.SetTableRemarksGenerator.class,
					liquibase.changelog.visitor.ExpectedChangesVisitor.class,
					liquibase.sdk.verifytest.VerifiedTestFactory.class,
					liquibase.change.core.supplier.MergeColumnChangeSupplier.class,
					liquibase.changelog.OfflineChangeLogHistoryService.class,
					liquibase.sqlgenerator.core.AddDefaultValueGeneratorPostgres.class,
					liquibase.datatype.core.UUIDType.class, liquibase.datatype.LiquibaseDataType.class,
					liquibase.sqlgenerator.core.InsertOrUpdateGeneratorMySQL.class,
					liquibase.serializer.core.string.StringChangeLogSerializer.class,
					liquibase.statement.ColumnConstraint.class, liquibase.datatype.DataTypeFactory.class,
					liquibase.statement.core.CreateViewStatement.class,
					liquibase.snapshot.jvm.PrimaryKeySnapshotGenerator.class,
					liquibase.snapshot.JdbcDatabaseSnapshot.class, liquibase.datatype.core.CurrencyType.class,
					liquibase.sqlgenerator.core.FindForeignKeyConstraintsGeneratorDB2.class,
					liquibase.util.FileUtil.class, liquibase.statement.core.AddUniqueConstraintStatement.class,
					liquibase.precondition.core.ChangeSetExecutedPrecondition.class,
					liquibase.servicelocator.PrioritizedService.class,
					liquibase.sdk.verifytest.TestPermutation.OkResult.class,
					liquibase.snapshot.jvm.ForeignKeySnapshotGenerator.class,
					liquibase.sdk.supplier.database.ConnectionConfigurationFactory.class,
					liquibase.util.StringUtils.ToStringFormatter.class,
					liquibase.sdk.supplier.resource.ResourceSupplier.class,
					liquibase.statement.core.UpdateStatement.class, liquibase.structure.core.DataType.class,
					liquibase.diff.Difference.class, liquibase.sdk.convert.ConvertCommand.class,
					liquibase.change.core.RenameTableChange.class,
					liquibase.sdk.supplier.database.ConnectionSupplier.ConfigTemplate.class,
					liquibase.statement.UniqueConstraint.class,
					liquibase.change.core.supplier.CreateIndexChangeSupplier.class,
					liquibase.datatype.core.DoubleType.class, liquibase.precondition.core.DBMSPrecondition.class,
					liquibase.resource.ClassLoaderResourceAccessor.class,
					liquibase.integration.commandline.CommandLineResourceAccessor.class,
					liquibase.precondition.ErrorPrecondition.class,
					liquibase.sdk.supplier.database.DatabaseSupplier.class, liquibase.changelog.DatabaseChangeLog.class,
					liquibase.structure.DatabaseObjectCollection.class, liquibase.util.CollectionUtil.class,
					liquibase.change.core.AddPrimaryKeyChange.class, liquibase.statement.ForeignKeyConstraint.class,
					liquibase.datatype.core.ClobType.class, liquibase.changelog.visitor.ListVisitor.class,
					liquibase.servicelocator.PackageScanFilter.class, liquibase.dbdoc.PendingSQLWriter.class,
					liquibase.sqlgenerator.core.AddAutoIncrementGenerator.class,
					liquibase.change.core.supplier.AlterSequenceChangeSupplier.class,
					liquibase.datatype.core.CharType.class, liquibase.structure.core.PrimaryKey.class,
					liquibase.change.core.EmptyChange.class, liquibase.change.core.LoadDataChange.class,
					liquibase.database.core.supplier.HsqlConnSupplier.class,
					liquibase.change.core.DropSequenceChange.class, liquibase.util.RegexMatcher.class,
					liquibase.diff.output.changelog.core.MissingUniqueConstraintChangeGenerator.class,
					liquibase.structure.core.Column.AutoIncrementInformation.class,
					liquibase.change.AddColumnConfig.class,
					liquibase.diff.output.changelog.core.ChangedIndexChangeGenerator.class,
					liquibase.change.core.AddNotNullConstraintChange.class,
					liquibase.diff.output.changelog.MissingObjectChangeGenerator.class,
					liquibase.change.core.DropAllForeignKeyConstraintsChange.class,
					liquibase.statement.core.DropUniqueConstraintStatement.class,
					liquibase.database.core.SQLiteDatabase.class,
					liquibase.change.core.supplier.DropForeignKeyConstraintChangeSupplier.class,
					liquibase.parser.ChangeLogParserFactory.class,
					liquibase.sdk.supplier.database.ConnectionSupplier.class,
					liquibase.statement.ExecutablePreparedStatement.class, liquibase.changelog.ChangeSetStatus.class,
					liquibase.exception.ValidationErrors.class, liquibase.RuntimeEnvironment.class,
					liquibase.configuration.ConfigurationContainer.class, liquibase.structure.core.Relation.class,
					liquibase.sqlgenerator.core.GetViewDefinitionGenerator.class,
					liquibase.database.AbstractJdbcDatabase.class, liquibase.sqlgenerator.core.RuntimeGenerator.class,
					liquibase.parser.core.yaml.YamlChangeLogParser.class,
					liquibase.change.core.CreateSequenceChange.class,
					liquibase.change.core.DropDefaultValueChange.class,
					liquibase.diff.compare.core.PrimaryKeyComparator.class,
					liquibase.sql.visitor.SqlVisitorFactory.class, liquibase.statement.core.SetNullableStatement.class,
					liquibase.sqlgenerator.core.TagDatabaseGenerator.class,
					liquibase.servicelocator.PackageScanClassResolver.class,
					liquibase.sdk.supplier.change.AbstractChangeSupplier.class, liquibase.dbdoc.DBDocUtil.class,
					liquibase.database.core.supplier.MSSQLConnSupplier.class, liquibase.database.DatabaseList.class,
					liquibase.dbdoc.ChangeLogWriter.class,
					LiquibaseLogger.class

			);
		}

	}

}
