package de.cooperateproject.eabridge.eaobjectmodel;

import java.io.IOException;

import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Bootstrap {

	public static void bootstrap(HbDataStore hbds) {

		final SessionFactory sessionFac = hbds.getSessionFactory();

		Session session = sessionFac.openSession();
		Transaction trans = session.getTransaction();

		Package loadedPackage = null;
		try {
			loadedPackage = EAObjectModelHelper.loadModel("resources/Bootstrap.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		trans.begin();
		session.save(loadedPackage);
		trans.commit();

		// Not working
		// session.createSQLQuery("UPDATE `t_package` SET `Parent_ID`=0 WHERE
		// `Package_ID`=1").executeUpdate();
	}
}
