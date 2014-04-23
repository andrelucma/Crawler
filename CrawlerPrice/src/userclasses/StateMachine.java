/**
 * Your application code goes here
 */

package userclasses;

import java.util.Hashtable;
import java.util.Vector;

import generated.StateMachineBase;

import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.list.DefaultListModel;
import com.codename1.ui.list.GenericListCellRenderer;
import com.codename1.ui.util.Resources;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
	protected void initVars(Resources res){
	}  
  

    

    @Override
    protected void onMain_ButtonAction(Component c, ActionEvent event) 
    {
    	super.onMain_ButtonAction(c, event);
    	
    	Dialog.show("Monitorando Produto", "Seu aparelho irá notifica-lo quando encontrar o produto", "Fechar", null);
    
    }

    //@Override
    protected boolean initListModelList(List cmp) 
    {
    	Vector<String> vector = new Vector<String>();
    	
    	//Hashtable<String, String> table = new Hashtable<String, String>();
    	
    	vector.addElement("Samsung Android");
    	vector.addElement("LG");
    	vector.addElement("Nokia");
    	vector.addElement("PlayStation 4");
    	    	
    	cmp.setModel(new com.codename1.ui.list.DefaultListModel(vector));
    	   	
    	cmp.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent ev) {
    	    	 String nomeProduto = findList().getSelectedItem().toString();    	  
    	    	 
    	    	 boolean confirmaCancel = Dialog.show("Excluir Produto", "Tem certeza de que deseja excluir a busca por " + nomeProduto + "?", "Sim", "Não");
    	    	 
    	    	 //Remove produto e monta lista novamente
    	    	 if(confirmaCancel)
    	    	 {   	    	     
    	    	     Dialog.show("Monitorando Produto", nomeProduto, "Voltar", null);
    	    	     
    	    	     showForm("ListaProdutos", null);
    	    	 }    	 
    	    }
    	    
    	});
        
        
        return true;
    }

    @Override
    protected void onGUI1_SubmitAction(Component c, ActionEvent event) {
    		showForm("Main", null);    
    }

    
    @Override
    protected void onGUI1_ButtonListProdutosAction(Component c, ActionEvent event) {
    	   	showForm("ListaProdutos", null);   
    }

    @Override
    protected void onGUI1_ButtonAction(Component c, ActionEvent event) {
    	showForm("ListaNotificacao", null);    
    }

    
    @Override
    protected boolean initListModelListNot(List cmp) 
    {
    	Vector<String> vector = new Vector<String>();
    	
    	//Hashtable<String, String> table = new Hashtable<String, String>();
    	
    	vector.addElement("Link Samsung");
    	vector.addElement("Link LG");
    	vector.addElement("Link Nokia");
    	vector.addElement("Link PlayStation 4");
    	    	
    	cmp.setModel(new com.codename1.ui.list.DefaultListModel(vector)); 	
            
        return true;
    }
}