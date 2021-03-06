/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.reporting;

/**
 * @deprecated see reportingcompatibility module
 */
@Deprecated
public class SimpleColumnClassifier implements TableRowClassifier {
	
	private String columnName;
	
	private String valueIfNull;
	
	public SimpleColumnClassifier(String columnName, String valueIfNull) {
		this.columnName = columnName;
		this.valueIfNull = valueIfNull;
	}
	
	public String classify(TableRow row) {
		Object temp = row.get(columnName);
		return temp == null ? valueIfNull : temp.toString();
	}
	
}
