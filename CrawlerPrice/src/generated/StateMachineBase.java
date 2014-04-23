/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("AutoCompleteTextField", com.codename1.ui.AutoCompleteTextField.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("OnOffSwitch", com.codename1.components.OnOffSwitch.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("List", com.codename1.ui.List.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "GUI 1";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("AutoCompleteTextField", com.codename1.ui.AutoCompleteTextField.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("OnOffSwitch", com.codename1.components.OnOffSwitch.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("List", com.codename1.ui.List.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "GUI 1");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Container findContainer3(Component root) {
        return (com.codename1.ui.Container)findByName("Container3", root);
    }

    public com.codename1.ui.Container findContainer3() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.List findListNot(Component root) {
        return (com.codename1.ui.List)findByName("ListNot", root);
    }

    public com.codename1.ui.List findListNot() {
        com.codename1.ui.List cmp = (com.codename1.ui.List)findByName("ListNot", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.List)findByName("ListNot", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Container findContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButtonListProdutos(Component root) {
        return (com.codename1.ui.Button)findByName("buttonListProdutos", root);
    }

    public com.codename1.ui.Button findButtonListProdutos() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("buttonListProdutos", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("buttonListProdutos", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findSubmit(Component root) {
        return (com.codename1.ui.Button)findByName("submit", root);
    }

    public com.codename1.ui.Button findSubmit() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("submit", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("submit", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.OnOffSwitch findOnOffSwitch(Component root) {
        return (com.codename1.components.OnOffSwitch)findByName("OnOffSwitch", root);
    }

    public com.codename1.components.OnOffSwitch findOnOffSwitch() {
        com.codename1.components.OnOffSwitch cmp = (com.codename1.components.OnOffSwitch)findByName("OnOffSwitch", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.OnOffSwitch)findByName("OnOffSwitch", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField(Component root) {
        return (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField", root);
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField() {
        com.codename1.ui.AutoCompleteTextField cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel2(Component root) {
        return (com.codename1.ui.Label)findByName("Label2", root);
    }

    public com.codename1.ui.Label findLabel2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.List findList(Component root) {
        return (com.codename1.ui.List)findByName("List", root);
    }

    public com.codename1.ui.List findList() {
        com.codename1.ui.List cmp = (com.codename1.ui.List)findByName("List", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.List)findByName("List", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField1(Component root) {
        return (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField1", root);
    }

    public com.codename1.ui.AutoCompleteTextField findAutoCompleteTextField1() {
        com.codename1.ui.AutoCompleteTextField cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.AutoCompleteTextField)findByName("AutoCompleteTextField1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    protected void exitForm(Form f) {
        if("GUI 1".equals(f.getName())) {
            exitGUI1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ListaProdutos".equals(f.getName())) {
            exitListaProdutos(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ListaNotificacao".equals(f.getName())) {
            exitListaNotificacao(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitGUI1(Form f) {
    }


    protected void exitMain(Form f) {
    }


    protected void exitListaProdutos(Form f) {
    }


    protected void exitListaNotificacao(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("GUI 1".equals(f.getName())) {
            beforeGUI1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ListaProdutos".equals(f.getName())) {
            beforeListaProdutos(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ListaNotificacao".equals(f.getName())) {
            beforeListaNotificacao(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeGUI1(Form f) {
    }


    protected void beforeMain(Form f) {
    }


    protected void beforeListaProdutos(Form f) {
    }


    protected void beforeListaNotificacao(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("GUI 1".equals(c.getName())) {
            beforeContainerGUI1(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ListaProdutos".equals(c.getName())) {
            beforeContainerListaProdutos(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ListaNotificacao".equals(c.getName())) {
            beforeContainerListaNotificacao(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerGUI1(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }


    protected void beforeContainerListaProdutos(Container c) {
    }


    protected void beforeContainerListaNotificacao(Container c) {
    }

    protected void postShow(Form f) {
        if("GUI 1".equals(f.getName())) {
            postGUI1(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ListaProdutos".equals(f.getName())) {
            postListaProdutos(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ListaNotificacao".equals(f.getName())) {
            postListaNotificacao(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postGUI1(Form f) {
    }


    protected void postMain(Form f) {
    }


    protected void postListaProdutos(Form f) {
    }


    protected void postListaNotificacao(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("GUI 1".equals(c.getName())) {
            postContainerGUI1(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ListaProdutos".equals(c.getName())) {
            postContainerListaProdutos(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ListaNotificacao".equals(c.getName())) {
            postContainerListaNotificacao(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerGUI1(Container c) {
    }


    protected void postContainerMain(Container c) {
    }


    protected void postContainerListaProdutos(Container c) {
    }


    protected void postContainerListaNotificacao(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("GUI 1".equals(rootName)) {
            onCreateGUI1();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

        if("ListaProdutos".equals(rootName)) {
            onCreateListaProdutos();
            aboutToShowThisContainer = null;
            return;
        }

        if("ListaNotificacao".equals(rootName)) {
            onCreateListaNotificacao();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateGUI1() {
    }


    protected void onCreateMain() {
    }


    protected void onCreateListaProdutos() {
    }


    protected void onCreateListaNotificacao() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("GUI 1".equals(f.getName())) {
            getStateGUI1(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("ListaProdutos".equals(f.getName())) {
            getStateListaProdutos(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("ListaNotificacao".equals(f.getName())) {
            getStateListaNotificacao(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateGUI1(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }


    protected void getStateListaProdutos(Form f, Hashtable h) {
    }


    protected void getStateListaNotificacao(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("GUI 1".equals(f.getName())) {
            setStateGUI1(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("ListaProdutos".equals(f.getName())) {
            setStateListaProdutos(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("ListaNotificacao".equals(f.getName())) {
            setStateListaNotificacao(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateGUI1(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }


    protected void setStateListaProdutos(Form f, Hashtable state) {
    }


    protected void setStateListaNotificacao(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("ListNot".equals(listName)) {
            return initListModelListNot(cmp);
        }
        if("List".equals(listName)) {
            return initListModelList(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelListNot(List cmp) {
        return false;
    }

    protected boolean initListModelList(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("GUI 1")) {
            if("submit".equals(c.getName())) {
                onGUI1_SubmitAction(c, event);
                return;
            }
            if("buttonListProdutos".equals(c.getName())) {
                onGUI1_ButtonListProdutosAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onGUI1_ButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("AutoCompleteTextField".equals(c.getName())) {
                onMain_AutoCompleteTextFieldAction(c, event);
                return;
            }
            if("AutoCompleteTextField1".equals(c.getName())) {
                onMain_AutoCompleteTextField1Action(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onMain_ButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("ListaProdutos")) {
            if("List".equals(c.getName())) {
                onListaProdutos_ListAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("ListaNotificacao")) {
            if("ListNot".equals(c.getName())) {
                onListaNotificacao_ListNotAction(c, event);
                return;
            }
        }
    }

      protected void onGUI1_SubmitAction(Component c, ActionEvent event) {
      }

      protected void onGUI1_ButtonListProdutosAction(Component c, ActionEvent event) {
      }

      protected void onGUI1_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_AutoCompleteTextFieldAction(Component c, ActionEvent event) {
      }

      protected void onMain_AutoCompleteTextField1Action(Component c, ActionEvent event) {
      }

      protected void onMain_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onListaProdutos_ListAction(Component c, ActionEvent event) {
      }

      protected void onListaNotificacao_ListNotAction(Component c, ActionEvent event) {
      }

}
