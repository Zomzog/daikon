// ============================================================================
//
// Copyright (C) 2006-2017 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.daikon.messages.header.producer;

/**
 * A default implementation of {@link TimestampProvider} using the Java API.
 */
public class LocalTimestampProvider implements TimestampProvider {

    @Override
    public long getCurrentTimestamp() {
        return System.currentTimeMillis();
    }
}
