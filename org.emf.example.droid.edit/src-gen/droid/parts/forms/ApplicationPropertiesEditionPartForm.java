/**
 * Generated with Acceleo
 */
package droid.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import droid.parts.ApplicationPropertiesEditionPart;
import droid.parts.DroidViewsRepository;
import droid.providers.DroidMessages;


// End of user code

/**
 * 
 * 
 */
public class ApplicationPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ApplicationPropertiesEditionPart {

	protected Text name;
	protected Text packageName;
	protected Text versionCode;
	protected Text versionName;
	protected ReferencesTable screens;
	protected List<ViewerFilter> screensBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> screensFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable layouts;
	protected List<ViewerFilter> layoutsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> layoutsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable resources;
	protected List<ViewerFilter> resourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resourcesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ApplicationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence applicationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = applicationStep.addStep(DroidViewsRepository.Application.Properties.class);
		propertiesStep.addStep(DroidViewsRepository.Application.Properties.name);
		propertiesStep.addStep(DroidViewsRepository.Application.Properties.packageName);
		propertiesStep.addStep(DroidViewsRepository.Application.Properties.versionCode);
		propertiesStep.addStep(DroidViewsRepository.Application.Properties.versionName);
		propertiesStep.addStep(DroidViewsRepository.Application.Properties.screens);
		propertiesStep.addStep(DroidViewsRepository.Application.Properties.layouts);
		propertiesStep.addStep(DroidViewsRepository.Application.Properties.resources);
		
		
		composer = new PartComposer(applicationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == DroidViewsRepository.Application.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.Application.Properties.name) {
					return 		createNameText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.Application.Properties.packageName) {
					return 		createPackageNameText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.Application.Properties.versionCode) {
					return 		createVersionCodeText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.Application.Properties.versionName) {
					return 		createVersionNameText(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.Application.Properties.screens) {
					return createScreensTableComposition(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.Application.Properties.layouts) {
					return createLayoutsTableComposition(widgetFactory, parent);
				}
				if (key == DroidViewsRepository.Application.Properties.resources) {
					return createResourcesTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(DroidMessages.ApplicationPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.ApplicationPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.Application.Properties.name, DroidViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, DroidViewsRepository.Application.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.Application.Properties.name, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPackageNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.ApplicationPropertiesEditionPart_PackageNameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.Application.Properties.packageName, DroidViewsRepository.FORM_KIND));
		packageName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		packageName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData packageNameData = new GridData(GridData.FILL_HORIZONTAL);
		packageName.setLayoutData(packageNameData);
		packageName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.packageName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packageName.getText()));
			}
		});
		packageName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.packageName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packageName.getText()));
				}
			}
		});
		EditingUtils.setID(packageName, DroidViewsRepository.Application.Properties.packageName);
		EditingUtils.setEEFtype(packageName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.Application.Properties.packageName, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createVersionCodeText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.ApplicationPropertiesEditionPart_VersionCodeLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.Application.Properties.versionCode, DroidViewsRepository.FORM_KIND));
		versionCode = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		versionCode.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData versionCodeData = new GridData(GridData.FILL_HORIZONTAL);
		versionCode.setLayoutData(versionCodeData);
		versionCode.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.versionCode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, versionCode.getText()));
			}
		});
		versionCode.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.versionCode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, versionCode.getText()));
				}
			}
		});
		EditingUtils.setID(versionCode, DroidViewsRepository.Application.Properties.versionCode);
		EditingUtils.setEEFtype(versionCode, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.Application.Properties.versionCode, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createVersionNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, DroidMessages.ApplicationPropertiesEditionPart_VersionNameLabel, propertiesEditionComponent.isRequired(DroidViewsRepository.Application.Properties.versionName, DroidViewsRepository.FORM_KIND));
		versionName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		versionName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData versionNameData = new GridData(GridData.FILL_HORIZONTAL);
		versionName.setLayoutData(versionNameData);
		versionName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.versionName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, versionName.getText()));
			}
		});
		versionName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.versionName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, versionName.getText()));
				}
			}
		});
		EditingUtils.setID(versionName, DroidViewsRepository.Application.Properties.versionName);
		EditingUtils.setEEFtype(versionName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(DroidViewsRepository.Application.Properties.versionName, DroidViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createScreensTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.screens = new ReferencesTable(DroidMessages.ApplicationPropertiesEditionPart_ScreensLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.screens, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				screens.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.screens, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				screens.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.screens, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				screens.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.screens, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				screens.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.screensFilters) {
			this.screens.addFilter(filter);
		}
		this.screens.setHelpText(propertiesEditionComponent.getHelpContent(DroidViewsRepository.Application.Properties.screens, DroidViewsRepository.FORM_KIND));
		this.screens.createControls(parent, widgetFactory);
		this.screens.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.screens, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData screensData = new GridData(GridData.FILL_HORIZONTAL);
		screensData.horizontalSpan = 3;
		this.screens.setLayoutData(screensData);
		this.screens.setLowerBound(0);
		this.screens.setUpperBound(-1);
		screens.setID(DroidViewsRepository.Application.Properties.screens);
		screens.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createLayoutsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.layouts = new ReferencesTable(DroidMessages.ApplicationPropertiesEditionPart_LayoutsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.layouts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				layouts.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.layouts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				layouts.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.layouts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				layouts.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.layouts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				layouts.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.layoutsFilters) {
			this.layouts.addFilter(filter);
		}
		this.layouts.setHelpText(propertiesEditionComponent.getHelpContent(DroidViewsRepository.Application.Properties.layouts, DroidViewsRepository.FORM_KIND));
		this.layouts.createControls(parent, widgetFactory);
		this.layouts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.layouts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData layoutsData = new GridData(GridData.FILL_HORIZONTAL);
		layoutsData.horizontalSpan = 3;
		this.layouts.setLayoutData(layoutsData);
		this.layouts.setLowerBound(0);
		this.layouts.setUpperBound(-1);
		layouts.setID(DroidViewsRepository.Application.Properties.layouts);
		layouts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createResourcesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.resources = new ReferencesTable(DroidMessages.ApplicationPropertiesEditionPart_ResourcesLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				resources.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				resources.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				resources.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				resources.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.resourcesFilters) {
			this.resources.addFilter(filter);
		}
		this.resources.setHelpText(propertiesEditionComponent.getHelpContent(DroidViewsRepository.Application.Properties.resources, DroidViewsRepository.FORM_KIND));
		this.resources.createControls(parent, widgetFactory);
		this.resources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ApplicationPropertiesEditionPartForm.this, DroidViewsRepository.Application.Properties.resources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resourcesData = new GridData(GridData.FILL_HORIZONTAL);
		resourcesData.horizontalSpan = 3;
		this.resources.setLayoutData(resourcesData);
		this.resources.setLowerBound(0);
		this.resources.setUpperBound(-1);
		resources.setID(DroidViewsRepository.Application.Properties.resources);
		resources.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#getPackageName()
	 * 
	 */
	public String getPackageName() {
		return packageName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#setPackageName(String newValue)
	 * 
	 */
	public void setPackageName(String newValue) {
		if (newValue != null) {
			packageName.setText(newValue);
		} else {
			packageName.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#getVersionCode()
	 * 
	 */
	public String getVersionCode() {
		return versionCode.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#setVersionCode(String newValue)
	 * 
	 */
	public void setVersionCode(String newValue) {
		if (newValue != null) {
			versionCode.setText(newValue);
		} else {
			versionCode.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#getVersionName()
	 * 
	 */
	public String getVersionName() {
		return versionName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#setVersionName(String newValue)
	 * 
	 */
	public void setVersionName(String newValue) {
		if (newValue != null) {
			versionName.setText(newValue);
		} else {
			versionName.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#initScreens(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initScreens(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		screens.setContentProvider(contentProvider);
		screens.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#updateScreens()
	 * 
	 */
	public void updateScreens() {
	screens.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#addFilterScreens(ViewerFilter filter)
	 * 
	 */
	public void addFilterToScreens(ViewerFilter filter) {
		screensFilters.add(filter);
		if (this.screens != null) {
			this.screens.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#addBusinessFilterScreens(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToScreens(ViewerFilter filter) {
		screensBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#isContainedInScreensTable(EObject element)
	 * 
	 */
	public boolean isContainedInScreensTable(EObject element) {
		return ((ReferencesTableSettings)screens.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#initLayouts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initLayouts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		layouts.setContentProvider(contentProvider);
		layouts.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#updateLayouts()
	 * 
	 */
	public void updateLayouts() {
	layouts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#addFilterLayouts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLayouts(ViewerFilter filter) {
		layoutsFilters.add(filter);
		if (this.layouts != null) {
			this.layouts.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#addBusinessFilterLayouts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLayouts(ViewerFilter filter) {
		layoutsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#isContainedInLayoutsTable(EObject element)
	 * 
	 */
	public boolean isContainedInLayoutsTable(EObject element) {
		return ((ReferencesTableSettings)layouts.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#initResources(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		resources.setContentProvider(contentProvider);
		resources.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#updateResources()
	 * 
	 */
	public void updateResources() {
	resources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#addFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResources(ViewerFilter filter) {
		resourcesFilters.add(filter);
		if (this.resources != null) {
			this.resources.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#addBusinessFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResources(ViewerFilter filter) {
		resourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see droid.parts.ApplicationPropertiesEditionPart#isContainedInResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInResourcesTable(EObject element) {
		return ((ReferencesTableSettings)resources.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return DroidMessages.Application_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
