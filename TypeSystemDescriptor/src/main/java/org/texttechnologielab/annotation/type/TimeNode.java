

/* First created by JCasGen Sun Sep 23 23:34:17 CEST 2018 */
package org.texttechnologielab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;


/**
 * Updated by JCasGen Tue Oct 30 13:23:36 CET 2018
 * XML source: C:/Users/Philipp Helfrich/TextImager/TextAnnotator/TypeSystemDescriptor/src/main/resources/desc/type/TextTechnologyTimeAnno.xml
 *
 * @generated
 */
public class TimeNode extends Node {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(TimeNode.class);
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
    protected TimeNode() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public TimeNode(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public TimeNode(JCas jcas) {
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
    //* Feature: xPos

    /**
     * getter for xPos - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getXPos() {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_xPos == null)
            jcasType.jcas.throwFeatMissing("xPos", "org.texttechnologielab.annotation.type.TimeNode");
        return jcasType.ll_cas.ll_getIntValue(addr, ((TimeNode_Type) jcasType).casFeatCode_xPos);
    }

    /**
     * setter for xPos - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setXPos(int v) {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_xPos == null)
            jcasType.jcas.throwFeatMissing("xPos", "org.texttechnologielab.annotation.type.TimeNode");
        jcasType.ll_cas.ll_setIntValue(addr, ((TimeNode_Type) jcasType).casFeatCode_xPos, v);
    }


    //*--------------*
    //* Feature: depth

    /**
     * getter for depth - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getDepth() {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_depth == null)
            jcasType.jcas.throwFeatMissing("depth", "org.texttechnologielab.annotation.type.TimeNode");
        return jcasType.ll_cas.ll_getIntValue(addr, ((TimeNode_Type) jcasType).casFeatCode_depth);
    }

    /**
     * setter for depth - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setDepth(int v) {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_depth == null)
            jcasType.jcas.throwFeatMissing("depth", "org.texttechnologielab.annotation.type.TimeNode");
        jcasType.ll_cas.ll_setIntValue(addr, ((TimeNode_Type) jcasType).casFeatCode_depth, v);
    }


    //*--------------*
    //* Feature: value

    /**
     * getter for value - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getValue() {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_value == null)
            jcasType.jcas.throwFeatMissing("value", "org.texttechnologielab.annotation.type.TimeNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((TimeNode_Type) jcasType).casFeatCode_value);
    }

    /**
     * setter for value - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setValue(String v) {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_value == null)
            jcasType.jcas.throwFeatMissing("value", "org.texttechnologielab.annotation.type.TimeNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((TimeNode_Type) jcasType).casFeatCode_value, v);
    }


    //*--------------*
    //* Feature: subvalue

    /**
     * getter for subvalue - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getSubvalue() {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_subvalue == null)
            jcasType.jcas.throwFeatMissing("subvalue", "org.texttechnologielab.annotation.type.TimeNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((TimeNode_Type) jcasType).casFeatCode_subvalue);
    }

    /**
     * setter for subvalue - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setSubvalue(String v) {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_subvalue == null)
            jcasType.jcas.throwFeatMissing("subvalue", "org.texttechnologielab.annotation.type.TimeNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((TimeNode_Type) jcasType).casFeatCode_subvalue, v);
    }


    //*--------------*
    //* Feature: begin

    /**
     * getter for begin - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getBegin() {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_begin == null)
            jcasType.jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.TimeNode");
        return jcasType.ll_cas.ll_getIntValue(addr, ((TimeNode_Type) jcasType).casFeatCode_begin);
    }

    /**
     * setter for begin - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setBegin(int v) {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_begin == null)
            jcasType.jcas.throwFeatMissing("begin", "org.texttechnologielab.annotation.type.TimeNode");
        jcasType.ll_cas.ll_setIntValue(addr, ((TimeNode_Type) jcasType).casFeatCode_begin, v);
    }


    //*--------------*
    //* Feature: nodes

    /**
     * getter for nodes - gets
     *
     * @return value of the feature
     * @generated
     */
    public FSArray getNodes() {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_nodes == null)
            jcasType.jcas.throwFeatMissing("nodes", "org.texttechnologielab.annotation.type.TimeNode");
        return (FSArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TimeNode_Type) jcasType).casFeatCode_nodes)));
    }

    /**
     * setter for nodes - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setNodes(FSArray v) {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_nodes == null)
            jcasType.jcas.throwFeatMissing("nodes", "org.texttechnologielab.annotation.type.TimeNode");
        jcasType.ll_cas.ll_setRefValue(addr, ((TimeNode_Type) jcasType).casFeatCode_nodes, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for nodes - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public TOP getNodes(int i) {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_nodes == null)
            jcasType.jcas.throwFeatMissing("nodes", "org.texttechnologielab.annotation.type.TimeNode");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TimeNode_Type) jcasType).casFeatCode_nodes), i);
        return (TOP) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TimeNode_Type) jcasType).casFeatCode_nodes), i)));
    }

    /**
     * indexed setter for nodes - sets an indexed value -
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setNodes(int i, TOP v) {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_nodes == null)
            jcasType.jcas.throwFeatMissing("nodes", "org.texttechnologielab.annotation.type.TimeNode");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TimeNode_Type) jcasType).casFeatCode_nodes), i);
        jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TimeNode_Type) jcasType).casFeatCode_nodes), i, jcasType.ll_cas.ll_getFSRef(v));
    }


    //*--------------*
    //* Feature: edges

    /**
     * getter for edges - gets
     *
     * @return value of the feature
     * @generated
     */
    public FSArray getEdges() {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_edges == null)
            jcasType.jcas.throwFeatMissing("edges", "org.texttechnologielab.annotation.type.TimeNode");
        return (FSArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TimeNode_Type) jcasType).casFeatCode_edges)));
    }

    /**
     * setter for edges - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setEdges(FSArray v) {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_edges == null)
            jcasType.jcas.throwFeatMissing("edges", "org.texttechnologielab.annotation.type.TimeNode");
        jcasType.ll_cas.ll_setRefValue(addr, ((TimeNode_Type) jcasType).casFeatCode_edges, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for edges - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public TOP getEdges(int i) {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_edges == null)
            jcasType.jcas.throwFeatMissing("edges", "org.texttechnologielab.annotation.type.TimeNode");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TimeNode_Type) jcasType).casFeatCode_edges), i);
        return (TOP) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TimeNode_Type) jcasType).casFeatCode_edges), i)));
    }

    /**
     * indexed setter for edges - sets an indexed value -
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setEdges(int i, TOP v) {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_edges == null)
            jcasType.jcas.throwFeatMissing("edges", "org.texttechnologielab.annotation.type.TimeNode");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TimeNode_Type) jcasType).casFeatCode_edges), i);
        jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TimeNode_Type) jcasType).casFeatCode_edges), i, jcasType.ll_cas.ll_getFSRef(v));
    }


    //*--------------*
    //* Feature: end

    /**
     * getter for end - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getEnd() {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_end == null)
            jcasType.jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.TimeNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((TimeNode_Type) jcasType).casFeatCode_end);
    }

    /**
     * setter for end - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setEnd(String v) {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_end == null)
            jcasType.jcas.throwFeatMissing("end", "org.texttechnologielab.annotation.type.TimeNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((TimeNode_Type) jcasType).casFeatCode_end, v);
    }


    //*--------------*
    //* Feature: x

    /**
     * getter for x - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getX() {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_x == null)
            jcasType.jcas.throwFeatMissing("x", "org.texttechnologielab.annotation.type.TimeNode");
        return jcasType.ll_cas.ll_getIntValue(addr, ((TimeNode_Type) jcasType).casFeatCode_x);
    }

    /**
     * setter for x - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setX(int v) {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_x == null)
            jcasType.jcas.throwFeatMissing("x", "org.texttechnologielab.annotation.type.TimeNode");
        jcasType.ll_cas.ll_setIntValue(addr, ((TimeNode_Type) jcasType).casFeatCode_x, v);
    }


    //*--------------*
    //* Feature: y

    /**
     * getter for y - gets
     *
     * @return value of the feature
     * @generated
     */
    public int getY() {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_y == null)
            jcasType.jcas.throwFeatMissing("y", "org.texttechnologielab.annotation.type.TimeNode");
        return jcasType.ll_cas.ll_getIntValue(addr, ((TimeNode_Type) jcasType).casFeatCode_y);
    }

    /**
     * setter for y - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setY(int v) {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_y == null)
            jcasType.jcas.throwFeatMissing("y", "org.texttechnologielab.annotation.type.TimeNode");
        jcasType.ll_cas.ll_setIntValue(addr, ((TimeNode_Type) jcasType).casFeatCode_y, v);
    }


    //*--------------*
    //* Feature: additionalvalue

    /**
     * getter for additionalvalue - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getAdditionalvalue() {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_additionalvalue == null)
            jcasType.jcas.throwFeatMissing("additionalvalue", "org.texttechnologielab.annotation.type.TimeNode");
        return jcasType.ll_cas.ll_getStringValue(addr, ((TimeNode_Type) jcasType).casFeatCode_additionalvalue);
    }

    /**
     * setter for additionalvalue - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setAdditionalvalue(String v) {
        if (TimeNode_Type.featOkTst && ((TimeNode_Type) jcasType).casFeat_additionalvalue == null)
            jcasType.jcas.throwFeatMissing("additionalvalue", "org.texttechnologielab.annotation.type.TimeNode");
        jcasType.ll_cas.ll_setStringValue(addr, ((TimeNode_Type) jcasType).casFeatCode_additionalvalue, v);
    }
}

    