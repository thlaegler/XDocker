package de.laegler.xdocker.lang.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.laegler.xdocker.lang.services.XDockerLangGrammarAccess;
import de.laegler.xdocker.lang.xDockerLang.XDockerFrom;
import de.laegler.xdocker.lang.xDockerLang.XDockerLangPackage;
import de.laegler.xdocker.lang.xDockerLang.XDockerMaintainer;
import de.laegler.xdocker.lang.xDockerLang.XDockerModel;
import de.laegler.xdocker.lang.xDockerLang.XDockerRun;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class XDockerLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XDockerLangGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == XDockerLangPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XDockerLangPackage.XDOCKER_FROM:
				if(context == grammarAccess.getXDockerFromRule() ||
				   context == grammarAccess.getXDockerInstructionRule()) {
					sequence_XDockerFrom(context, (XDockerFrom) semanticObject); 
					return; 
				}
				else break;
			case XDockerLangPackage.XDOCKER_MAINTAINER:
				if(context == grammarAccess.getXDockerInstructionRule() ||
				   context == grammarAccess.getXDockerMaintainerRule()) {
					sequence_XDockerMaintainer(context, (XDockerMaintainer) semanticObject); 
					return; 
				}
				else break;
			case XDockerLangPackage.XDOCKER_MODEL:
				if(context == grammarAccess.getXDockerModelRule()) {
					sequence_XDockerModel(context, (XDockerModel) semanticObject); 
					return; 
				}
				else break;
			case XDockerLangPackage.XDOCKER_RUN:
				if(context == grammarAccess.getXDockerInstructionRule() ||
				   context == grammarAccess.getXDockerRunRule()) {
					sequence_XDockerRun(context, (XDockerRun) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=FROM
	 */
	protected void sequence_XDockerFrom(EObject context, XDockerFrom semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XDockerLangPackage.Literals.XDOCKER_INSTRUCTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDockerLangPackage.Literals.XDOCKER_INSTRUCTION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXDockerFromAccess().getNameFROMTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=MAINTAINER
	 */
	protected void sequence_XDockerMaintainer(EObject context, XDockerMaintainer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XDockerLangPackage.Literals.XDOCKER_INSTRUCTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDockerLangPackage.Literals.XDOCKER_INSTRUCTION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXDockerMaintainerAccess().getNameMAINTAINERTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     instruction+=XDockerInstruction*
	 */
	protected void sequence_XDockerModel(EObject context, XDockerModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=RUN
	 */
	protected void sequence_XDockerRun(EObject context, XDockerRun semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XDockerLangPackage.Literals.XDOCKER_INSTRUCTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDockerLangPackage.Literals.XDOCKER_INSTRUCTION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXDockerRunAccess().getNameRUNTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
}
