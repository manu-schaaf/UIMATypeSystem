
/* First created by JCasGen Thu Jul 04 16:14:34 CEST 2019 */
package org.texttechnologylab.annotation.administration;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData_Type;

/**
 * Updated by JCasGen Thu Jul 04 16:14:34 CEST 2019
 *
 * @generated
 */
public class Document_Type extends DocumentMetaData_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = Document.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.administration.Document");

    /**
     * @generated
     */
    final Feature casFeat_user;
    /**
     * @generated
     */
    final int casFeatCode_user;

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public String getUser(int addr) {
        if (featOkTst && casFeat_user == null)
            jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.administration.Document");
        return ll_cas.ll_getStringValue(addr, casFeatCode_user);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setUser(int addr, String v) {
        if (featOkTst && casFeat_user == null)
            jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.administration.Document");
        ll_cas.ll_setStringValue(addr, casFeatCode_user, v);
    }


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Document_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_user = jcas.getRequiredFeatureDE(casType, "user", "uima.cas.String", featOkTst);
        casFeatCode_user = (null == casFeat_user) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_user).getCode();

    }
}



    