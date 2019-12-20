

/* First created by JCasGen Wed Dec 18 04:18:30 UTC 2019 */
package de.tudarmstadt.ukp.dkpro.core.sentiment.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Stanford CoreNLP Sentiment annotation
 * Updated by JCasGen Wed Dec 18 04:18:30 UTC 2019
 * XML source: /home/woaibritneyspears/acl2016-convincing-arguments/code/de.tudarmstadt.ukp.dkpro.core.api.sentiment-asl/target/jcasgen/typesystem.xml
 * @generated */
public class StanfordSentimentAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(StanfordSentimentAnnotation.class);
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
  protected StanfordSentimentAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public StanfordSentimentAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public StanfordSentimentAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public StanfordSentimentAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: veryNegative

  /** getter for veryNegative - gets Value of veryNegative
   * @generated */
  public double getVeryNegative() {
    if (StanfordSentimentAnnotation_Type.featOkTst && ((StanfordSentimentAnnotation_Type)jcasType).casFeat_veryNegative == null)
      jcasType.jcas.throwFeatMissing("veryNegative", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((StanfordSentimentAnnotation_Type)jcasType).casFeatCode_veryNegative);}
    
  /** setter for veryNegative - sets Value of veryNegative 
   * @generated */
  public void setVeryNegative(double v) {
    if (StanfordSentimentAnnotation_Type.featOkTst && ((StanfordSentimentAnnotation_Type)jcasType).casFeat_veryNegative == null)
      jcasType.jcas.throwFeatMissing("veryNegative", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((StanfordSentimentAnnotation_Type)jcasType).casFeatCode_veryNegative, v);}    
   
    
  //*--------------*
  //* Feature: negative

  /** getter for negative - gets Value of negative
   * @generated */
  public double getNegative() {
    if (StanfordSentimentAnnotation_Type.featOkTst && ((StanfordSentimentAnnotation_Type)jcasType).casFeat_negative == null)
      jcasType.jcas.throwFeatMissing("negative", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((StanfordSentimentAnnotation_Type)jcasType).casFeatCode_negative);}
    
  /** setter for negative - sets Value of negative 
   * @generated */
  public void setNegative(double v) {
    if (StanfordSentimentAnnotation_Type.featOkTst && ((StanfordSentimentAnnotation_Type)jcasType).casFeat_negative == null)
      jcasType.jcas.throwFeatMissing("negative", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((StanfordSentimentAnnotation_Type)jcasType).casFeatCode_negative, v);}    
   
    
  //*--------------*
  //* Feature: neutral

  /** getter for neutral - gets Value of neutral
   * @generated */
  public double getNeutral() {
    if (StanfordSentimentAnnotation_Type.featOkTst && ((StanfordSentimentAnnotation_Type)jcasType).casFeat_neutral == null)
      jcasType.jcas.throwFeatMissing("neutral", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((StanfordSentimentAnnotation_Type)jcasType).casFeatCode_neutral);}
    
  /** setter for neutral - sets Value of neutral 
   * @generated */
  public void setNeutral(double v) {
    if (StanfordSentimentAnnotation_Type.featOkTst && ((StanfordSentimentAnnotation_Type)jcasType).casFeat_neutral == null)
      jcasType.jcas.throwFeatMissing("neutral", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((StanfordSentimentAnnotation_Type)jcasType).casFeatCode_neutral, v);}    
   
    
  //*--------------*
  //* Feature: positive

  /** getter for positive - gets Value of positive
   * @generated */
  public double getPositive() {
    if (StanfordSentimentAnnotation_Type.featOkTst && ((StanfordSentimentAnnotation_Type)jcasType).casFeat_positive == null)
      jcasType.jcas.throwFeatMissing("positive", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((StanfordSentimentAnnotation_Type)jcasType).casFeatCode_positive);}
    
  /** setter for positive - sets Value of positive 
   * @generated */
  public void setPositive(double v) {
    if (StanfordSentimentAnnotation_Type.featOkTst && ((StanfordSentimentAnnotation_Type)jcasType).casFeat_positive == null)
      jcasType.jcas.throwFeatMissing("positive", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((StanfordSentimentAnnotation_Type)jcasType).casFeatCode_positive, v);}    
   
    
  //*--------------*
  //* Feature: veryPositive

  /** getter for veryPositive - gets Value of veryPositive
   * @generated */
  public double getVeryPositive() {
    if (StanfordSentimentAnnotation_Type.featOkTst && ((StanfordSentimentAnnotation_Type)jcasType).casFeat_veryPositive == null)
      jcasType.jcas.throwFeatMissing("veryPositive", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((StanfordSentimentAnnotation_Type)jcasType).casFeatCode_veryPositive);}
    
  /** setter for veryPositive - sets Value of veryPositive 
   * @generated */
  public void setVeryPositive(double v) {
    if (StanfordSentimentAnnotation_Type.featOkTst && ((StanfordSentimentAnnotation_Type)jcasType).casFeat_veryPositive == null)
      jcasType.jcas.throwFeatMissing("veryPositive", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((StanfordSentimentAnnotation_Type)jcasType).casFeatCode_veryPositive, v);}    
  }

    