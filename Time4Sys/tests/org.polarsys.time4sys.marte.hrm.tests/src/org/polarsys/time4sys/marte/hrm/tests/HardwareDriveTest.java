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
/**
 */
package org.polarsys.time4sys.marte.hrm.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.marte.hrm.HardwareDrive;
import org.polarsys.time4sys.marte.hrm.HrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hardware Drive</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareDriveTest extends HardwareStorageMemoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HardwareDriveTest.class);
	}

	/**
	 * Constructs a new Hardware Drive test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareDriveTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hardware Drive test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HardwareDrive getFixture() {
		return (HardwareDrive)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HrmFactory.eINSTANCE.createHardwareDrive());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //HardwareDriveTest
