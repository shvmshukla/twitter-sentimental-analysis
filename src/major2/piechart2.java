/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package major2;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author avnegers
 */
public class piechart2 extends ApplicationFrame {
   
   public piechart2( String title ) {
      super( title ); 
      setContentPane(createDemoPanel( ));
   }
   static double pp,np;
   public piechart2(double pp,double np, String title ) {
      super( title ); 
      this.pp=pp;
      this.np=np;
      setContentPane(createDemoPanel( ));
   }
   
   private static PieDataset createDataset( ) {
      DefaultPieDataset dataset = new DefaultPieDataset( );
      dataset.setValue( "Positive Twittes %" , new Double(pp));  
      dataset.setValue( "Negetive Twittes %" , new Double(np) );   
      return dataset;         
   }
   
   private static JFreeChart createChart( PieDataset dataset ) {
      JFreeChart chart = ChartFactory.createPieChart(      
         "Analysis Report",   // chart title 
         dataset,          // data    
         true,             // include legend   
         true, 
         false);

      return chart;
   }
   
   public static JPanel createDemoPanel( ) {
      JFreeChart chart = createChart(createDataset( ) );  
      return new ChartPanel( chart ); 
   }

  /* public static void main( String[ ] args ) {
      piechart2 demo = new piechart2("Mobile Sales" );  
      demo.setSize( 560 , 367 );    
      RefineryUtilities.centerFrameOnScreen( demo );    
     demo.setVisible( true ); 
   }*/
}
