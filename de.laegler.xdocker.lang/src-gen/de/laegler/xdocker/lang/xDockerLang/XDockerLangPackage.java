/**
 */
package de.laegler.xdocker.lang.xDockerLang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.laegler.xdocker.lang.xDockerLang.XDockerLangFactory
 * @model kind="package"
 * @generated
 */
public interface XDockerLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "xDockerLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.laegler.de/xdocker/lang/XDockerLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "xDockerLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XDockerLangPackage eINSTANCE = de.laegler.xdocker.lang.xDockerLang.impl.XDockerLangPackageImpl.init();

  /**
   * The meta object id for the '{@link de.laegler.xdocker.lang.xDockerLang.impl.XDockerModelImpl <em>XDocker Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerModelImpl
   * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerLangPackageImpl#getXDockerModel()
   * @generated
   */
  int XDOCKER_MODEL = 0;

  /**
   * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDOCKER_MODEL__INSTRUCTION = 0;

  /**
   * The number of structural features of the '<em>XDocker Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDOCKER_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.laegler.xdocker.lang.xDockerLang.impl.XDockerInstructionImpl <em>XDocker Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerInstructionImpl
   * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerLangPackageImpl#getXDockerInstruction()
   * @generated
   */
  int XDOCKER_INSTRUCTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDOCKER_INSTRUCTION__NAME = 0;

  /**
   * The number of structural features of the '<em>XDocker Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDOCKER_INSTRUCTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.laegler.xdocker.lang.xDockerLang.impl.XDockerFromImpl <em>XDocker From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerFromImpl
   * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerLangPackageImpl#getXDockerFrom()
   * @generated
   */
  int XDOCKER_FROM = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDOCKER_FROM__NAME = XDOCKER_INSTRUCTION__NAME;

  /**
   * The number of structural features of the '<em>XDocker From</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDOCKER_FROM_FEATURE_COUNT = XDOCKER_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.laegler.xdocker.lang.xDockerLang.impl.XDockerMaintainerImpl <em>XDocker Maintainer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerMaintainerImpl
   * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerLangPackageImpl#getXDockerMaintainer()
   * @generated
   */
  int XDOCKER_MAINTAINER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDOCKER_MAINTAINER__NAME = XDOCKER_INSTRUCTION__NAME;

  /**
   * The number of structural features of the '<em>XDocker Maintainer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDOCKER_MAINTAINER_FEATURE_COUNT = XDOCKER_INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.laegler.xdocker.lang.xDockerLang.impl.XDockerRunImpl <em>XDocker Run</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerRunImpl
   * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerLangPackageImpl#getXDockerRun()
   * @generated
   */
  int XDOCKER_RUN = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDOCKER_RUN__NAME = XDOCKER_INSTRUCTION__NAME;

  /**
   * The number of structural features of the '<em>XDocker Run</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDOCKER_RUN_FEATURE_COUNT = XDOCKER_INSTRUCTION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link de.laegler.xdocker.lang.xDockerLang.XDockerModel <em>XDocker Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XDocker Model</em>'.
   * @see de.laegler.xdocker.lang.xDockerLang.XDockerModel
   * @generated
   */
  EClass getXDockerModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.laegler.xdocker.lang.xDockerLang.XDockerModel#getInstruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instruction</em>'.
   * @see de.laegler.xdocker.lang.xDockerLang.XDockerModel#getInstruction()
   * @see #getXDockerModel()
   * @generated
   */
  EReference getXDockerModel_Instruction();

  /**
   * Returns the meta object for class '{@link de.laegler.xdocker.lang.xDockerLang.XDockerInstruction <em>XDocker Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XDocker Instruction</em>'.
   * @see de.laegler.xdocker.lang.xDockerLang.XDockerInstruction
   * @generated
   */
  EClass getXDockerInstruction();

  /**
   * Returns the meta object for the attribute '{@link de.laegler.xdocker.lang.xDockerLang.XDockerInstruction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.laegler.xdocker.lang.xDockerLang.XDockerInstruction#getName()
   * @see #getXDockerInstruction()
   * @generated
   */
  EAttribute getXDockerInstruction_Name();

  /**
   * Returns the meta object for class '{@link de.laegler.xdocker.lang.xDockerLang.XDockerFrom <em>XDocker From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XDocker From</em>'.
   * @see de.laegler.xdocker.lang.xDockerLang.XDockerFrom
   * @generated
   */
  EClass getXDockerFrom();

  /**
   * Returns the meta object for class '{@link de.laegler.xdocker.lang.xDockerLang.XDockerMaintainer <em>XDocker Maintainer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XDocker Maintainer</em>'.
   * @see de.laegler.xdocker.lang.xDockerLang.XDockerMaintainer
   * @generated
   */
  EClass getXDockerMaintainer();

  /**
   * Returns the meta object for class '{@link de.laegler.xdocker.lang.xDockerLang.XDockerRun <em>XDocker Run</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XDocker Run</em>'.
   * @see de.laegler.xdocker.lang.xDockerLang.XDockerRun
   * @generated
   */
  EClass getXDockerRun();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XDockerLangFactory getXDockerLangFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.laegler.xdocker.lang.xDockerLang.impl.XDockerModelImpl <em>XDocker Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerModelImpl
     * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerLangPackageImpl#getXDockerModel()
     * @generated
     */
    EClass XDOCKER_MODEL = eINSTANCE.getXDockerModel();

    /**
     * The meta object literal for the '<em><b>Instruction</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDOCKER_MODEL__INSTRUCTION = eINSTANCE.getXDockerModel_Instruction();

    /**
     * The meta object literal for the '{@link de.laegler.xdocker.lang.xDockerLang.impl.XDockerInstructionImpl <em>XDocker Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerInstructionImpl
     * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerLangPackageImpl#getXDockerInstruction()
     * @generated
     */
    EClass XDOCKER_INSTRUCTION = eINSTANCE.getXDockerInstruction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XDOCKER_INSTRUCTION__NAME = eINSTANCE.getXDockerInstruction_Name();

    /**
     * The meta object literal for the '{@link de.laegler.xdocker.lang.xDockerLang.impl.XDockerFromImpl <em>XDocker From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerFromImpl
     * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerLangPackageImpl#getXDockerFrom()
     * @generated
     */
    EClass XDOCKER_FROM = eINSTANCE.getXDockerFrom();

    /**
     * The meta object literal for the '{@link de.laegler.xdocker.lang.xDockerLang.impl.XDockerMaintainerImpl <em>XDocker Maintainer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerMaintainerImpl
     * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerLangPackageImpl#getXDockerMaintainer()
     * @generated
     */
    EClass XDOCKER_MAINTAINER = eINSTANCE.getXDockerMaintainer();

    /**
     * The meta object literal for the '{@link de.laegler.xdocker.lang.xDockerLang.impl.XDockerRunImpl <em>XDocker Run</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerRunImpl
     * @see de.laegler.xdocker.lang.xDockerLang.impl.XDockerLangPackageImpl#getXDockerRun()
     * @generated
     */
    EClass XDOCKER_RUN = eINSTANCE.getXDockerRun();

  }

} //XDockerLangPackage
