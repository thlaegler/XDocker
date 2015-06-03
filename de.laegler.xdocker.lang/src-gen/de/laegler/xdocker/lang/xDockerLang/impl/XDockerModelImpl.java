/**
 */
package de.laegler.xdocker.lang.xDockerLang.impl;

import de.laegler.xdocker.lang.xDockerLang.XDockerInstruction;
import de.laegler.xdocker.lang.xDockerLang.XDockerLangPackage;
import de.laegler.xdocker.lang.xDockerLang.XDockerModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XDocker Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.laegler.xdocker.lang.xDockerLang.impl.XDockerModelImpl#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XDockerModelImpl extends MinimalEObjectImpl.Container implements XDockerModel
{
  /**
   * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstruction()
   * @generated
   * @ordered
   */
  protected EList<XDockerInstruction> instruction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XDockerModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XDockerLangPackage.Literals.XDOCKER_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XDockerInstruction> getInstruction()
  {
    if (instruction == null)
    {
      instruction = new EObjectContainmentEList<XDockerInstruction>(XDockerInstruction.class, this, XDockerLangPackage.XDOCKER_MODEL__INSTRUCTION);
    }
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XDockerLangPackage.XDOCKER_MODEL__INSTRUCTION:
        return ((InternalEList<?>)getInstruction()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XDockerLangPackage.XDOCKER_MODEL__INSTRUCTION:
        return getInstruction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XDockerLangPackage.XDOCKER_MODEL__INSTRUCTION:
        getInstruction().clear();
        getInstruction().addAll((Collection<? extends XDockerInstruction>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XDockerLangPackage.XDOCKER_MODEL__INSTRUCTION:
        getInstruction().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XDockerLangPackage.XDOCKER_MODEL__INSTRUCTION:
        return instruction != null && !instruction.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //XDockerModelImpl
