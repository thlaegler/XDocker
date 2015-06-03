/**
 */
package de.laegler.xdocker.lang.xDockerLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XDocker Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.laegler.xdocker.lang.xDockerLang.XDockerInstruction#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.laegler.xdocker.lang.xDockerLang.XDockerLangPackage#getXDockerInstruction()
 * @model
 * @generated
 */
public interface XDockerInstruction extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.laegler.xdocker.lang.xDockerLang.XDockerLangPackage#getXDockerInstruction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.laegler.xdocker.lang.xDockerLang.XDockerInstruction#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // XDockerInstruction
