/**
 */
package de.laegler.xdocker.lang.xDockerLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XDocker Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.laegler.xdocker.lang.xDockerLang.XDockerModel#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see de.laegler.xdocker.lang.xDockerLang.XDockerLangPackage#getXDockerModel()
 * @model
 * @generated
 */
public interface XDockerModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Instruction</b></em>' containment reference list.
   * The list contents are of type {@link de.laegler.xdocker.lang.xDockerLang.XDockerInstruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instruction</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instruction</em>' containment reference list.
   * @see de.laegler.xdocker.lang.xDockerLang.XDockerLangPackage#getXDockerModel_Instruction()
   * @model containment="true"
   * @generated
   */
  EList<XDockerInstruction> getInstruction();

} // XDockerModel
