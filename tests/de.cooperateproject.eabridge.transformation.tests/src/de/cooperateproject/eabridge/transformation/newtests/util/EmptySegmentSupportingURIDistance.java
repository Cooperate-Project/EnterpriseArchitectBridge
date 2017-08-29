package de.cooperateproject.eabridge.transformation.newtests.util;

import java.util.ArrayList;

import org.eclipse.emf.compare.match.eobject.URIDistance;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;

class EmptySegmentSupportingURIDistance extends URIDistance {
	
	@Override
	public int proximity(Iterable<String> aPath, Iterable<String> bPath) {
		ArrayList<String> aPathNew = Lists.newArrayList(aPath);
		ArrayList<String> bPathNew = Lists.newArrayList(bPath);
		if (aPathNew.size() == bPathNew.size()) {
			for (int i = 0; i < aPathNew.size(); ++i) {
				if (Strings.isNullOrEmpty(aPathNew.get(i)) || Strings.isNullOrEmpty(bPathNew.get(i))) {
					aPathNew.set(i, "");
					bPathNew.set(i, "");
				}
			}
		}
		return super.proximity(aPathNew, bPathNew);
	}
	
}