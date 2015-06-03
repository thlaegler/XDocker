/**
 */
package de.laegler.xdocker.lang.xDockerLang.impl;

import de.laegler.xdocker.lang.xDockerLang.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XDockerLangFactoryImpl extends EFactoryImpl implements XDockerLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XDockerLangFactory init()
  {
    try
    {
      XDockerLangFactory theXDockerLangFactory = (XDockerLangFactory)EPackage.Registry.INSTANCE.getEFactory(XDockerLangPackage.eNS_URI);
      if (theXDockerLangFactory != null)
      {
        return theXDockerLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XDockerLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDockerLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case XDockerLangPackage.XDOCKER_MODEL: return createXDockerModel();
      case XDockerLangPackage.XDOCKER_INSTRUCTION: return createXDockerInstruction();
      case XDockerLangPackage.XDOCKER_FROM: return createXDockerFrom();
      case XDockerLangPackage.XDOCKER_MAINTAINER: return createXDockerMaintainer();
      case XDockerLangPackage.XDOCKER_RUN: return createXDockerRun();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDockerModel createXDockerModel()
  {
    XDockerModelImpl xDockerModel = new XDockerModelImpl();
    return xDockerModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDockerInstruction createXDockerInstruction()
  {
    XDockerInstructionImpl xDockerInstruction = new XDockerInstructionImpl();
    return xDockerInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDockerFrom createXDockerFrom()
  {
    XDockerFromImpl xDockerFrom = new XDockerFromImpl();
    return xDockerFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDockerMaintainer createXDockerMaintainer()
  {
    XDockerMaintainerImpl xDockerMaintainer = new XDockerMaintainerImpl();
    return xDockerMaintainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDockerRun createXDockerRun()
  {
    XDockerRunImpl xDockerRun = new XDockerRunImpl();
    return xDockerRun;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDockerLangPackage getXDockerLangPackage()
  {
    return (XDockerLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XDockerLangPackage getPackage()
  {
    return XDockerLangPackage.eINSTANCE;
  }

} //XDockerLangFactoryImpl
