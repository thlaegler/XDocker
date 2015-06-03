/**
 */
package de.laegler.xdocker.lang.xDockerLang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.laegler.xdocker.lang.xDockerLang.XDockerLangPackage
 * @generated
 */
public interface XDockerLangFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XDockerLangFactory eINSTANCE = de.laegler.xdocker.lang.xDockerLang.impl.XDockerLangFactoryImpl.init();

  /**
   * Returns a new object of class '<em>XDocker Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XDocker Model</em>'.
   * @generated
   */
  XDockerModel createXDockerModel();

  /**
   * Returns a new object of class '<em>XDocker Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XDocker Instruction</em>'.
   * @generated
   */
  XDockerInstruction createXDockerInstruction();

  /**
   * Returns a new object of class '<em>XDocker From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XDocker From</em>'.
   * @generated
   */
  XDockerFrom createXDockerFrom();

  /**
   * Returns a new object of class '<em>XDocker Maintainer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XDocker Maintainer</em>'.
   * @generated
   */
  XDockerMaintainer createXDockerMaintainer();

  /**
   * Returns a new object of class '<em>XDocker Run</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XDocker Run</em>'.
   * @generated
   */
  XDockerRun createXDockerRun();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  XDockerLangPackage getXDockerLangPackage();

} //XDockerLangFactory
