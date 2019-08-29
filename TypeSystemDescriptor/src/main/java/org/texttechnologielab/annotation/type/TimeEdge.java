

/* First created by JCasGen Sun Sep 23 23:33:56 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


/**
 * Updated by JCasGen Tue Oct 30 13:23:36 CET 2018
 * XML source: C:/Users/Philipp Helfrich/TextImager/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyTimeAnno.xml
 *
 * @generated
 */
public class TimeEdge extends Edge {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(TimeEdge.class);
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int type = typeIndexID;

    /**
     * @return index of the type
     * @generated
     */
    @Override
    public int getTypeIndexID() {
        return typeIndexID;
    }

    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    protected TimeEdge() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public TimeEdge(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public TimeEdge(JCas jcas) {
        super(jcas);
        readObject();
    }

    /**
     * <!-- begin-user-doc -->
     * Write your own initialization here
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    private void readObject() {/*default - does nothing empty block */}


    //*--------------*
    //* Feature: mode

    /**
     * getter for mode - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getMode() {
        if (TimeEdge_Type.featOkTst && ((TimeEdge_Type) jcasType).casFeat_mode == null)
            jcasType.jcas.throwFeatMissing("mode", "org.texttechnologielab.annotation.type.TimeEdge");
        return jcasType.ll_cas.ll_getStringValue(addr, ((TimeEdge_Type) jcasType).casFeatCode_mode);
    }

    /**
     * setter for mode - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setMode(String v) {
        if (TimeEdge_Type.featOkTst && ((TimeEdge_Type) jcasType).casFeat_mode == null)
            jcasType.jcas.throwFeatMissing("mode", "org.texttechnologielab.annotation.type.TimeEdge");
        jcasType.ll_cas.ll_setStringValue(addr, ((TimeEdge_Type) jcasType).casFeatCode_mode, v);
    }
}

    