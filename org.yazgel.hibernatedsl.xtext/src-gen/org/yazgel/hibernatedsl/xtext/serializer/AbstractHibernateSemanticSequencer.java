package org.yazgel.hibernatedsl.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.yazgel.hibernate.DataType;
import org.yazgel.hibernate.Entity;
import org.yazgel.hibernate.HibernatePackage;
import org.yazgel.hibernate.Module;
import org.yazgel.hibernate.Reference;
import org.yazgel.hibernatedsl.xtext.services.HibernateGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractHibernateSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private HibernateGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == HibernatePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case HibernatePackage.DATA_TYPE:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getFeatureRule()) {
					sequence_DataType(context, (DataType) semanticObject); 
					return; 
				}
				else break;
			case HibernatePackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case HibernatePackage.MODULE:
				if(context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case HibernatePackage.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (org.yazgel.hibernate.Package) semanticObject); 
					return; 
				}
				else break;
			case HibernatePackage.REFERENCE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getReferenceRule()) {
					sequence_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((annotations+=FetureAnnotation annotations+=FetureAnnotation*)? name=ID type=DataTypes many?='[]'?)
	 */
	protected void sequence_DataType(EObject context, DataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((annotations+=EntityAnnotation annotations+=EntityAnnotation*)? name=ID superEntity=[Entity|ID]? (features+=Feature features+=Feature*)?)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QUALIFIED_NAME (packages+=Package packages+=Package*)?)
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QUALIFIED_NAME (entities+=Entity entities+=Entity*)?)
	 */
	protected void sequence_Package(EObject context, org.yazgel.hibernate.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((annotations+=FetureAnnotation annotations+=FetureAnnotation*)? name=ID reference=[Entity|ID] many?='[]'?)
	 */
	protected void sequence_Reference(EObject context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
