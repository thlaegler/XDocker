/**
 */
package de.laegler.xdocker.lang.xDockerLang.util;

import de.laegler.xdocker.lang.xDockerLang.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.laegler.xdocker.lang.xDockerLang.XDockerLangPackage
 * @generated
 */
public class XDockerLangSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XDockerLangPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDockerLangSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = XDockerLangPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case XDockerLangPackage.XDOCKER_MODEL:
      {
        XDockerModel xDockerModel = (XDockerModel)theEObject;
        T result = caseXDockerModel(xDockerModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDockerLangPackage.XDOCKER_INSTRUCTION:
      {
        XDockerInstruction xDockerInstruction = (XDockerInstruction)theEObject;
        T result = caseXDockerInstruction(xDockerInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDockerLangPackage.XDOCKER_FROM:
      {
        XDockerFrom xDockerFrom = (XDockerFrom)theEObject;
        T result = caseXDockerFrom(xDockerFrom);
        if (result == null) result = caseXDockerInstruction(xDockerFrom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDockerLangPackage.XDOCKER_MAINTAINER:
      {
        XDockerMaintainer xDockerMaintainer = (XDockerMaintainer)theEObject;
        T result = caseXDockerMaintainer(xDockerMaintainer);
        if (result == null) result = caseXDockerInstruction(xDockerMaintainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDockerLangPackage.XDOCKER_RUN:
      {
        XDockerRun xDockerRun = (XDockerRun)theEObject;
        T result = caseXDockerRun(xDockerRun);
        if (result == null) result = caseXDockerInstruction(xDockerRun);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XDocker Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XDocker Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXDockerModel(XDockerModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XDocker Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XDocker Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXDockerInstruction(XDockerInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XDocker From</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XDocker From</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXDockerFrom(XDockerFrom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XDocker Maintainer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XDocker Maintainer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXDockerMaintainer(XDockerMaintainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XDocker Run</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XDocker Run</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXDockerRun(XDockerRun object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //XDockerLangSwitch
