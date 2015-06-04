/**
 */
package de.laegler.xdocker.lang.xDockerLang.util;

import de.laegler.xdocker.lang.xDockerLang.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.laegler.xdocker.lang.xDockerLang.XDockerLangPackage
 * @generated
 */
public class XDockerLangAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XDockerLangPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDockerLangAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = XDockerLangPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XDockerLangSwitch<Adapter> modelSwitch =
    new XDockerLangSwitch<Adapter>()
    {
      @Override
      public Adapter caseXDockerModel(XDockerModel object)
      {
        return createXDockerModelAdapter();
      }
      @Override
      public Adapter caseXDockerInstruction(XDockerInstruction object)
      {
        return createXDockerInstructionAdapter();
      }
      @Override
      public Adapter caseXDockerFrom(XDockerFrom object)
      {
        return createXDockerFromAdapter();
      }
      @Override
      public Adapter caseXDockerMaintainer(XDockerMaintainer object)
      {
        return createXDockerMaintainerAdapter();
      }
      @Override
      public Adapter caseXDockerRun(XDockerRun object)
      {
        return createXDockerRunAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.laegler.xdocker.lang.xDockerLang.XDockerModel <em>XDocker Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.laegler.xdocker.lang.xDockerLang.XDockerModel
   * @generated
   */
  public Adapter createXDockerModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.laegler.xdocker.lang.xDockerLang.XDockerInstruction <em>XDocker Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.laegler.xdocker.lang.xDockerLang.XDockerInstruction
   * @generated
   */
  public Adapter createXDockerInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.laegler.xdocker.lang.xDockerLang.XDockerFrom <em>XDocker From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.laegler.xdocker.lang.xDockerLang.XDockerFrom
   * @generated
   */
  public Adapter createXDockerFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.laegler.xdocker.lang.xDockerLang.XDockerMaintainer <em>XDocker Maintainer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.laegler.xdocker.lang.xDockerLang.XDockerMaintainer
   * @generated
   */
  public Adapter createXDockerMaintainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.laegler.xdocker.lang.xDockerLang.XDockerRun <em>XDocker Run</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.laegler.xdocker.lang.xDockerLang.XDockerRun
   * @generated
   */
  public Adapter createXDockerRunAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //XDockerLangAdapterFactory
