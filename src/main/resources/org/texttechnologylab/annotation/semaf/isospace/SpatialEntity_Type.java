
/* First created by JCasGen Mon Apr 06 13:25:05 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.semaf.isobase.Entity_Type;

/** 
 * Updated by JCasGen Tue Apr 07 19:23:38 CEST 2020
 * @generated */
public class SpatialEntity_Type extends Entity_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SpatialEntity.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
 
  /** @generated */
  final Feature casFeat_spatial_entitiy_type;
  /** @generated */
  final int     casFeatCode_spatial_entitiy_type;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSpatial_entitiy_type(int addr) {
        if (featOkTst && casFeat_spatial_entitiy_type == null)
      jcas.throwFeatMissing("spatial_entitiy_type", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_spatial_entitiy_type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpatial_entitiy_type(int addr, String v) {
        if (featOkTst && casFeat_spatial_entitiy_type == null)
      jcas.throwFeatMissing("spatial_entitiy_type", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_spatial_entitiy_type, v);}
    
  
 
  /** @generated */
  final Feature casFeat_dimensionality;
  /** @generated */
  final int     casFeatCode_dimensionality;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDimensionality(int addr) {
        if (featOkTst && casFeat_dimensionality == null)
      jcas.throwFeatMissing("dimensionality", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_dimensionality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDimensionality(int addr, String v) {
        if (featOkTst && casFeat_dimensionality == null)
      jcas.throwFeatMissing("dimensionality", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_dimensionality, v);}
    
  
 
  /** @generated */
  final Feature casFeat_form;
  /** @generated */
  final int     casFeatCode_form;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getForm(int addr) {
        if (featOkTst && casFeat_form == null)
      jcas.throwFeatMissing("form", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_form);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setForm(int addr, String v) {
        if (featOkTst && casFeat_form == null)
      jcas.throwFeatMissing("form", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_form, v);}
    
  
 
  /** @generated */
  final Feature casFeat_dcl;
  /** @generated */
  final int     casFeatCode_dcl;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getDcl(int addr) {
        if (featOkTst && casFeat_dcl == null)
      jcas.throwFeatMissing("dcl", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_dcl);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDcl(int addr, boolean v) {
        if (featOkTst && casFeat_dcl == null)
      jcas.throwFeatMissing("dcl", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_dcl, v);}
    
  
 
  /** @generated */
  final Feature casFeat_domain;
  /** @generated */
  final int     casFeatCode_domain;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDomain(int addr) {
        if (featOkTst && casFeat_domain == null)
      jcas.throwFeatMissing("domain", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_domain);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDomain(int addr, String v) {
        if (featOkTst && casFeat_domain == null)
      jcas.throwFeatMissing("domain", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_domain, v);}
    
  
 
  /** @generated */
  final Feature casFeat_lat;
  /** @generated */
  final int     casFeatCode_lat;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLat(int addr) {
        if (featOkTst && casFeat_lat == null)
      jcas.throwFeatMissing("lat", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lat);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLat(int addr, String v) {
        if (featOkTst && casFeat_lat == null)
      jcas.throwFeatMissing("lat", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_lat, v);}
    
  
 
  /** @generated */
  final Feature casFeat_long;
  /** @generated */
  final int     casFeatCode_long;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLong(int addr) {
        if (featOkTst && casFeat_long == null)
      jcas.throwFeatMissing("long", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_long);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLong(int addr, String v) {
        if (featOkTst && casFeat_long == null)
      jcas.throwFeatMissing("long", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_long, v);}
    
  
 
  /** @generated */
  final Feature casFeat_elevation;
  /** @generated */
  final int     casFeatCode_elevation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getElevation(int addr) {
        if (featOkTst && casFeat_elevation == null)
      jcas.throwFeatMissing("elevation", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_elevation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setElevation(int addr, int v) {
        if (featOkTst && casFeat_elevation == null)
      jcas.throwFeatMissing("elevation", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setRefValue(addr, casFeatCode_elevation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_countable;
  /** @generated */
  final int     casFeatCode_countable;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getCountable(int addr) {
        if (featOkTst && casFeat_countable == null)
      jcas.throwFeatMissing("countable", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_countable);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCountable(int addr, boolean v) {
        if (featOkTst && casFeat_countable == null)
      jcas.throwFeatMissing("countable", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_countable, v);}
    
  
 
  /** @generated */
  final Feature casFeat_gquant;
  /** @generated */
  final int     casFeatCode_gquant;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGquant(int addr) {
        if (featOkTst && casFeat_gquant == null)
      jcas.throwFeatMissing("gquant", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_gquant);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGquant(int addr, String v) {
        if (featOkTst && casFeat_gquant == null)
      jcas.throwFeatMissing("gquant", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_gquant, v);}
    
  
 
  /** @generated */
  final Feature casFeat_scopes;
  /** @generated */
  final int     casFeatCode_scopes;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getScopes(int addr) {
        if (featOkTst && casFeat_scopes == null)
      jcas.throwFeatMissing("scopes", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_scopes);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScopes(int addr, int v) {
        if (featOkTst && casFeat_scopes == null)
      jcas.throwFeatMissing("scopes", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setRefValue(addr, casFeatCode_scopes, v);}
    
  
 
  /** @generated */
  final Feature casFeat_object_id;
  /** @generated */
  final int     casFeatCode_object_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getObject_id(int addr) {
        if (featOkTst && casFeat_object_id == null)
      jcas.throwFeatMissing("object_id", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_object_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setObject_id(int addr, String v) {
        if (featOkTst && casFeat_object_id == null)
      jcas.throwFeatMissing("object_id", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_object_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_position;
  /** @generated */
  final int     casFeatCode_position;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPosition(int addr) {
        if (featOkTst && casFeat_position == null)
      jcas.throwFeatMissing("position", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_position);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPosition(int addr, int v) {
        if (featOkTst && casFeat_position == null)
      jcas.throwFeatMissing("position", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setRefValue(addr, casFeatCode_position, v);}
    
  
 
  /** @generated */
  final Feature casFeat_rotation;
  /** @generated */
  final int     casFeatCode_rotation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRotation(int addr) {
        if (featOkTst && casFeat_rotation == null)
      jcas.throwFeatMissing("rotation", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_rotation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRotation(int addr, int v) {
        if (featOkTst && casFeat_rotation == null)
      jcas.throwFeatMissing("rotation", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setRefValue(addr, casFeatCode_rotation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_scale;
  /** @generated */
  final int     casFeatCode_scale;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getScale(int addr) {
        if (featOkTst && casFeat_scale == null)
      jcas.throwFeatMissing("scale", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_scale);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScale(int addr, int v) {
        if (featOkTst && casFeat_scale == null)
      jcas.throwFeatMissing("scale", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setRefValue(addr, casFeatCode_scale, v);}
    
  
 
  /** @generated */
  final Feature casFeat_object_feature;
  /** @generated */
  final int     casFeatCode_object_feature;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getObject_feature(int addr) {
        if (featOkTst && casFeat_object_feature == null)
      jcas.throwFeatMissing("object_feature", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_object_feature);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setObject_feature(int addr, int v) {
        if (featOkTst && casFeat_object_feature == null)
      jcas.throwFeatMissing("object_feature", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setRefValue(addr, casFeatCode_object_feature, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SpatialEntity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_spatial_entitiy_type = jcas.getRequiredFeatureDE(casType, "spatial_entitiy_type", "uima.cas.String", featOkTst);
    casFeatCode_spatial_entitiy_type  = (null == casFeat_spatial_entitiy_type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_spatial_entitiy_type).getCode();

 
    casFeat_dimensionality = jcas.getRequiredFeatureDE(casType, "dimensionality", "uima.cas.String", featOkTst);
    casFeatCode_dimensionality  = (null == casFeat_dimensionality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dimensionality).getCode();

 
    casFeat_form = jcas.getRequiredFeatureDE(casType, "form", "uima.cas.String", featOkTst);
    casFeatCode_form  = (null == casFeat_form) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_form).getCode();

 
    casFeat_dcl = jcas.getRequiredFeatureDE(casType, "dcl", "uima.cas.Boolean", featOkTst);
    casFeatCode_dcl  = (null == casFeat_dcl) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dcl).getCode();

 
    casFeat_domain = jcas.getRequiredFeatureDE(casType, "domain", "uima.cas.String", featOkTst);
    casFeatCode_domain  = (null == casFeat_domain) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_domain).getCode();

 
    casFeat_lat = jcas.getRequiredFeatureDE(casType, "lat", "uima.cas.String", featOkTst);
    casFeatCode_lat  = (null == casFeat_lat) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lat).getCode();

 
    casFeat_long = jcas.getRequiredFeatureDE(casType, "long", "uima.cas.String", featOkTst);
    casFeatCode_long  = (null == casFeat_long) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_long).getCode();

 
    casFeat_elevation = jcas.getRequiredFeatureDE(casType, "elevation", "org.texttechnologylab.annotation.semaf.isospace.Measure", featOkTst);
    casFeatCode_elevation  = (null == casFeat_elevation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_elevation).getCode();

 
    casFeat_countable = jcas.getRequiredFeatureDE(casType, "countable", "uima.cas.Boolean", featOkTst);
    casFeatCode_countable  = (null == casFeat_countable) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_countable).getCode();

 
    casFeat_gquant = jcas.getRequiredFeatureDE(casType, "gquant", "uima.cas.String", featOkTst);
    casFeatCode_gquant  = (null == casFeat_gquant) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gquant).getCode();

 
    casFeat_scopes = jcas.getRequiredFeatureDE(casType, "scopes", "uima.cas.FSList", featOkTst);
    casFeatCode_scopes  = (null == casFeat_scopes) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scopes).getCode();

 
    casFeat_object_id = jcas.getRequiredFeatureDE(casType, "object_id", "uima.cas.String", featOkTst);
    casFeatCode_object_id  = (null == casFeat_object_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_object_id).getCode();

 
    casFeat_position = jcas.getRequiredFeatureDE(casType, "position", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3", featOkTst);
    casFeatCode_position  = (null == casFeat_position) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_position).getCode();

 
    casFeat_rotation = jcas.getRequiredFeatureDE(casType, "rotation", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec4", featOkTst);
    casFeatCode_rotation  = (null == casFeat_rotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rotation).getCode();

 
    casFeat_scale = jcas.getRequiredFeatureDE(casType, "scale", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3", featOkTst);
    casFeatCode_scale  = (null == casFeat_scale) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scale).getCode();

 
    casFeat_object_feature = jcas.getRequiredFeatureDE(casType, "object_feature", "uima.cas.FSList", featOkTst);
    casFeatCode_object_feature  = (null == casFeat_object_feature) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_object_feature).getCode();

  }
}



    