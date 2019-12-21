

/* First created by JCasGen Fri Dec 20 22:29:24 CST 2019 */
package de.tudarmstadt.ukp.experiments.argumentation.convincingness;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** xxx
 * Updated by JCasGen Fri Dec 20 22:29:24 CST 2019
 * XML source: /Users/sunxichen/acl-2016/code/argumentation-convincingness-experiments-java/target/jcasgen/typesystem.xml
 * @generated */
public class AdHocFeature extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AdHocFeature.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AdHocFeature() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AdHocFeature(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AdHocFeature(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AdHocFeature(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets value
   * @generated */
  public double getValue() {
    if (AdHocFeature_Type.featOkTst && ((AdHocFeature_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "de.tudarmstadt.ukp.experiments.argumentation.convincingness.AdHocFeature");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AdHocFeature_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets value 
   * @generated */
  public void setValue(double v) {
    if (AdHocFeature_Type.featOkTst && ((AdHocFeature_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "de.tudarmstadt.ukp.experiments.argumentation.convincingness.AdHocFeature");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AdHocFeature_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: name

  /** getter for name - gets Name
   * @generated */
  public String getName() {
    if (AdHocFeature_Type.featOkTst && ((AdHocFeature_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "de.tudarmstadt.ukp.experiments.argumentation.convincingness.AdHocFeature");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AdHocFeature_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets Name 
   * @generated */
  public void setName(String v) {
    if (AdHocFeature_Type.featOkTst && ((AdHocFeature_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "de.tudarmstadt.ukp.experiments.argumentation.convincingness.AdHocFeature");
    jcasType.ll_cas.ll_setStringValue(addr, ((AdHocFeature_Type)jcasType).casFeatCode_name, v);}    
  }

    