/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.polarsys.time4sys.model.time4sys.tests.Time4sysAllTest;

@RunWith(Suite.class)
@SuiteClasses({
	org.polarsys.time4sys.transformations.AllTests.class,
	Time4sysAllTest.class
})
public class AllTests {

}