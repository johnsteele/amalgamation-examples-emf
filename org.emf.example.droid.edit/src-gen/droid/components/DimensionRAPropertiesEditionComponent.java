/**
 * Generated with Acceleo
 */
package droid.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import droid.DimensionRA;
import droid.DimensionResource;
import droid.DroidFactory;
import droid.DroidPackage;
import droid.LayoutDimensionKind;
import droid.parts.DimensionRAPropertiesEditionPart;
import droid.parts.DroidViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class DimensionRAPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for resource EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings resourceSettings;
	
	/**
	 * Default constructor
	 * 
	 */
	public DimensionRAPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject dimensionRA, String editing_mode) {
		super(editingContext, dimensionRA, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DroidViewsRepository.class;
		partKey = DroidViewsRepository.DimensionRA.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final DimensionRA dimensionRA = (DimensionRA)elt;
			final DimensionRAPropertiesEditionPart basePart = (DimensionRAPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(DroidViewsRepository.DimensionRA.Properties.const_value)) {
				basePart.initConst_value((EEnum) DroidPackage.eINSTANCE.getLayoutDimensionVA_Const_value().getEType(), dimensionRA.getConst_value());
			}
			if (dimensionRA.getValue() != null && isAccessible(DroidViewsRepository.DimensionRA.Properties.value))
				basePart.setValue(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), dimensionRA.getValue()));
			
			if (dimensionRA.getPackage() != null && isAccessible(DroidViewsRepository.DimensionRA.Properties.package_))
				basePart.setPackage_(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), dimensionRA.getPackage()));
			
			if (dimensionRA.getExternalResource() != null && isAccessible(DroidViewsRepository.DimensionRA.Properties.externalResource))
				basePart.setExternalResource(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), dimensionRA.getExternalResource()));
			
			if (isAccessible(DroidViewsRepository.DimensionRA.Properties.resource)) {
				// init part
				resourceSettings = new EObjectFlatComboSettings(dimensionRA, DroidPackage.eINSTANCE.getDimensionRA_Resource());
				basePart.initResource(resourceSettings);
				// set the button mode
				basePart.setResourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			
			
			basePart.addFilterToResource(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof DimensionResource); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for resource
			// End of user code
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}








	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		DimensionRA dimensionRA = (DimensionRA)semanticObject;
		if (DroidViewsRepository.DimensionRA.Properties.const_value == event.getAffectedEditor()) {
			dimensionRA.setConst_value((LayoutDimensionKind)event.getNewValue());
		}
		if (DroidViewsRepository.DimensionRA.Properties.value == event.getAffectedEditor()) {
			dimensionRA.setValue((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.DimensionRA.Properties.package_ == event.getAffectedEditor()) {
			dimensionRA.setPackage((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.DimensionRA.Properties.externalResource == event.getAffectedEditor()) {
			dimensionRA.setExternalResource((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DroidViewsRepository.DimensionRA.Properties.resource == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				resourceSettings.setToReference((DimensionResource)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				DimensionResource eObject = DroidFactory.eINSTANCE.createDimensionResource();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				resourceSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			DimensionRAPropertiesEditionPart basePart = (DimensionRAPropertiesEditionPart)editingPart;
			if (DroidPackage.eINSTANCE.getLayoutDimensionVA_Const_value().equals(msg.getFeature()) && isAccessible(DroidViewsRepository.DimensionRA.Properties.const_value))
				basePart.setConst_value((Enumerator)msg.getNewValue());
			
			if (DroidPackage.eINSTANCE.getDimensionVA_Value().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.DimensionRA.Properties.value)) {
				if (msg.getNewValue() != null) {
					basePart.setValue(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setValue("");
				}
			}
			if (DroidPackage.eINSTANCE.getResourceAccess_Package().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.DimensionRA.Properties.package_)) {
				if (msg.getNewValue() != null) {
					basePart.setPackage_(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setPackage_("");
				}
			}
			if (DroidPackage.eINSTANCE.getResourceAccess_ExternalResource().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.DimensionRA.Properties.externalResource)) {
				if (msg.getNewValue() != null) {
					basePart.setExternalResource(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setExternalResource("");
				}
			}
			if (DroidPackage.eINSTANCE.getDimensionRA_Resource().equals(msg.getFeature()) && basePart != null && isAccessible(DroidViewsRepository.DimensionRA.Properties.resource))
				basePart.setResource((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (DroidViewsRepository.DimensionRA.Properties.const_value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getLayoutDimensionVA_Const_value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getLayoutDimensionVA_Const_value().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.DimensionRA.Properties.value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getDimensionVA_Value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getDimensionVA_Value().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.DimensionRA.Properties.package_ == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getResourceAccess_Package().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getResourceAccess_Package().getEAttributeType(), newValue);
				}
				if (DroidViewsRepository.DimensionRA.Properties.externalResource == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DroidPackage.eINSTANCE.getResourceAccess_ExternalResource().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DroidPackage.eINSTANCE.getResourceAccess_ExternalResource().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
