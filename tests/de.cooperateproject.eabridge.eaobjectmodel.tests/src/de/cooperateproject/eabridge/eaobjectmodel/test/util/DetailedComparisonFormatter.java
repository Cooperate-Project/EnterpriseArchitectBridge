package de.cooperateproject.eabridge.eaobjectmodel.test.util;

import org.xmlunit.diff.Comparison;
import org.xmlunit.diff.DefaultComparisonFormatter;

public class DetailedComparisonFormatter extends DefaultComparisonFormatter {

	@Override
	public String getDescription(Comparison arg0) {
		return String.format("%s%n%s", super.getDescription(arg0),
				super.getDetails(arg0.getControlDetails(), arg0.getType(), true));
	}

}
