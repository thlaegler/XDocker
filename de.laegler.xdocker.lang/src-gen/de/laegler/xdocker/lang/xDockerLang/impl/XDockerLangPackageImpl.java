/**
 */
package de.laegler.xdocker.lang.xDockerLang.impl;

import de.laegler.xdocker.lang.xDockerLang.XDockerFrom;
import de.laegler.xdocker.lang.xDockerLang.XDockerInstruction;
import de.laegler.xdocker.lang.xDockerLang.XDockerLangFactory;
import de.laegler.xdocker.lang.xDockerLang.XDockerLangPackage;
import de.laegler.xdocker.lang.xDockerLang.XDockerMaintainer;
import de.laegler.xdocker.lang.xDockerLang.XDockerModel;
import de.laegler.xdocker.lang.xDockerLang.XDockerRun;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XDockerLangPackageImpl extends EPackageImpl implements XDockerLangPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xDockerModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xDockerInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xDockerFromEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xDockerMaintainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xDockerRunEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.laegler.xdocker.lang.xDockerLang.XDockerLangPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private XDockerLangPackageImpl()
  {
    super(eNS_URI, XDockerLangFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link XDockerLangPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static XDockerLangPackage init()
  {
    if (isInited) return (XDockerLangPackage)EPackage.Registry.INSTANCE.getEPackage(XDockerLangPackage.eNS_URI);

    // Obtain or create and register package
    XDockerLangPackageImpl theXDockerLangPackage = (XDockerLangPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XDockerLangPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XDockerLangPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theXDockerLangPackage.createPackageContents();

    // Initialize created meta-data
    theXDockerLangPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theXDockerLangPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(XDockerLangPackage.eNS_URI, theXDockerLangPackage);
    return theXDockerLangPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXDockerModel()
  {
    return xDockerModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXDockerModel_Instruction()
  {
    return (EReference)xDockerModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXDockerInstruction()
  {
    return xDockerInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXDockerInstruction_Name()
  {
    return (EAttribute)xDockerInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXDockerFrom()
  {
    return xDockerFromEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXDockerMaintainer()
  {
    return xDockerMaintainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXDockerRun()
  {
    return xDockerRunEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDockerLangFactory getXDockerLangFactory()
  {
    return (XDockerLangFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    xDockerModelEClass = createEClass(XDOCKER_MODEL);
    createEReference(xDockerModelEClass, XDOCKER_MODEL__INSTRUCTION);

    xDockerInstructionEClass = createEClass(XDOCKER_INSTRUCTION);
    createEAttribute(xDockerInstructionEClass, XDOCKER_INSTRUCTION__NAME);

    xDockerFromEClass = createEClass(XDOCKER_FROM);

    xDockerMaintainerEClass = createEClass(XDOCKER_MAINTAINER);

    xDockerRunEClass = createEClass(XDOCKER_RUN);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    xDockerFromEClass.getESuperTypes().add(this.getXDockerInstruction());
    xDockerMaintainerEClass.getESuperTypes().add(this.getXDockerInstruction());
    xDockerRunEClass.getESuperTypes().add(this.getXDockerInstruction());

    // Initialize classes and features; add operations and parameters
    initEClass(xDockerModelEClass, XDockerModel.class, "XDockerModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXDockerModel_Instruction(), this.getXDockerInstruction(), null, "instruction", null, 0, -1, XDockerModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xDockerInstructionEClass, XDockerInstruction.class, "XDockerInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXDockerInstruction_Name(), ecorePackage.getEString(), "name", null, 0, 1, XDockerInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xDockerFromEClass, XDockerFrom.class, "XDockerFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xDockerMaintainerEClass, XDockerMaintainer.class, "XDockerMaintainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xDockerRunEClass, XDockerRun.class, "XDockerRun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //XDockerLangPackageImpl
