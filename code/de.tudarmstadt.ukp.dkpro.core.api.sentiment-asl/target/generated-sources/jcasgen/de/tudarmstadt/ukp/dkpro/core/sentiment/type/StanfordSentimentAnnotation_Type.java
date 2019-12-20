
/* First created by JCasGen Wed Dec 18 04:18:30 UTC 2019 */
package de.tudarmstadt.ukp.dkpro.core.sentiment.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Stanford CoreNLP Sentiment annotation
 * Updated by JCasGen Wed Dec 18 04:18:30 UTC 2019
 * @generated */
public class StanfordSentimentAnnotation_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (StanfordSentimentAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = StanfordSentimentAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new StanfordSentimentAnnotation(addr, StanfordSentimentAnnotation_Type.this);
  			   StanfordSentimentAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new StanfordSentimentAnnotation(addr, StanfordSentimentAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = StanfordSentimentAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
 
  /** @generated */
  final Feature casFeat_veryNegative;
  /** @generated */
  final int     casFeatCode_veryNegative;
  /** @generated */ 
  public double getVeryNegative(int addr) {
        if (featOkTst && casFeat_veryNegative == null)
      jcas.throwFeatMissing("veryNegative", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_veryNegative);
  }
  /** @generated */    
  public void setVeryNegative(int addr, double v) {
        if (featOkTst && casFeat_veryNegative == null)
      jcas.throwFeatMissing("veryNegative", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_veryNegative, v);}
    
  
 
  /** @generated */
  final Feature casFeat_negative;
  /** @generated */
  final int     casFeatCode_negative;
  /** @generated */ 
  public double getNegative(int addr) {
        if (featOkTst && casFeat_negative == null)
      jcas.throwFeatMissing("negative", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_negative);
  }
  /** @generated */    
  public void setNegative(int addr, double v) {
        if (featOkTst && casFeat_negative == null)
      jcas.throwFeatMissing("negative", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_negative, v);}
    
  
 
  /** @generated */
  final Feature casFeat_neutral;
  /** @generated */
  final int     casFeatCode_neutral;
  /** @generated */ 
  public double getNeutral(int addr) {
        if (featOkTst && casFeat_neutral == null)
      jcas.throwFeatMissing("neutral", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_neutral);
  }
  /** @generated */    
  public void setNeutral(int addr, double v) {
        if (featOkTst && casFeat_neutral == null)
      jcas.throwFeatMissing("neutral", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_neutral, v);}
    
  
 
  /** @generated */
  final Feature casFeat_positive;
  /** @generated */
  final int     casFeatCode_positive;
  /** @generated */ 
  public double getPositive(int addr) {
        if (featOkTst && casFeat_positive == null)
      jcas.throwFeatMissing("positive", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_positive);
  }
  /** @generated */    
  public void setPositive(int addr, double v) {
        if (featOkTst && casFeat_positive == null)
      jcas.throwFeatMissing("positive", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_positive, v);}
    
  
 
  /** @generated */
  final Feature casFeat_veryPositive;
  /** @generated */
  final int     casFeatCode_veryPositive;
  /** @generated */ 
  public double getVeryPositive(int addr) {
        if (featOkTst && casFeat_veryPositive == null)
      jcas.throwFeatMissing("veryPositive", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_veryPositive);
  }
  /** @generated */    
  public void setVeryPositive(int addr, double v) {
        if (featOkTst && casFeat_veryPositive == null)
      jcas.throwFeatMissing("veryPositive", "de.tudarmstadt.ukp.dkpro.core.sentiment.type.StanfordSentimentAnnotation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_veryPositive, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public StanfordSentimentAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_veryNegative = jcas.getRequiredFeatureDE(casType, "veryNegative", "uima.cas.Double", featOkTst);
    casFeatCode_veryNegative  = (null == casFeat_veryNegative) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_veryNegative).getCode();

 
    casFeat_negative = jcas.getRequiredFeatureDE(casType, "negative", "uima.cas.Double", featOkTst);
    casFeatCode_negative  = (null == casFeat_negative) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_negative).getCode();

 
    casFeat_neutral = jcas.getRequiredFeatureDE(casType, "neutral", "uima.cas.Double", featOkTst);
    casFeatCode_neutral  = (null == casFeat_neutral) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_neutral).getCode();

 
    casFeat_positive = jcas.getRequiredFeatureDE(casType, "positive", "uima.cas.Double", featOkTst);
    casFeatCode_positive  = (null == casFeat_positive) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_positive).getCode();

 
    casFeat_veryPositive = jcas.getRequiredFeatureDE(casType, "veryPositive", "uima.cas.Double", featOkTst);
    casFeatCode_veryPositive  = (null == casFeat_veryPositive) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_veryPositive).getCode();

  }
}



    