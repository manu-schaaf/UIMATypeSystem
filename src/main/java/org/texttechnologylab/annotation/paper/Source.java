

   
/* Apache UIMA v3 - First created by JCasGen Thu Jul 04 15:15:19 CEST 2024 */

package org.texttechnologylab.annotation.paper;


import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Thu Jul 04 15:15:19 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Source extends Annotation {

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static String _TypeName = "org.texttechnologylab.annotation.paper.Source";

    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(Source.class);
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


    /* *******************
     *   Feature Offsets *
     * *******************/

    public final static String _FeatName_doi = "doi";
    public final static String _FeatName_title = "title";
    public final static String _FeatName_authors = "authors";


    /* Feature Adjusted Offsets */
    private final static CallSite _FC_doi = TypeSystemImpl.createCallSite(Source.class, "doi");
    private final static MethodHandle _FH_doi = _FC_doi.dynamicInvoker();
    private final static CallSite _FC_title = TypeSystemImpl.createCallSite(Source.class, "title");
    private final static MethodHandle _FH_title = _FC_title.dynamicInvoker();
    private final static CallSite _FC_authors = TypeSystemImpl.createCallSite(Source.class, "authors");
    private final static MethodHandle _FH_authors = _FC_authors.dynamicInvoker();


    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    @Deprecated
    @SuppressWarnings("deprecation")
    protected Source() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param casImpl the CAS this Feature Structure belongs to
     * @param type    the type of this Feature Structure
     * @generated
     */
    public Source(TypeImpl type, CASImpl casImpl) {
        super(type, casImpl);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public Source(JCas jcas) {
        super(jcas);
        readObject();
    }


    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public Source(JCas jcas, int begin, int end) {
        super(jcas);
        setBegin(begin);
        setEnd(end);
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
    //* Feature: doi

    /**
     * getter for doi - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getDoi() {
        return _getStringValueNc(wrapGetIntCatchException(_FH_doi));
    }

    /**
     * setter for doi - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setDoi(String v) {
        _setStringValueNfc(wrapGetIntCatchException(_FH_doi), v);
    }


    //*--------------*
    //* Feature: title

    /**
     * getter for title - gets
     *
     * @return value of the feature
     * @generated
     */
    public String getTitle() {
        return _getStringValueNc(wrapGetIntCatchException(_FH_title));
    }

    /**
     * setter for title - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setTitle(String v) {
        _setStringValueNfc(wrapGetIntCatchException(_FH_title), v);
    }


    //*--------------*
    //* Feature: authors

    /**
     * getter for authors - gets
     *
     * @return value of the feature
     * @generated
     */
    public StringArray getAuthors() {
        return (StringArray) (_getFeatureValueNc(wrapGetIntCatchException(_FH_authors)));
    }

    /**
     * setter for authors - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setAuthors(StringArray v) {
        _setFeatureValueNcWj(wrapGetIntCatchException(_FH_authors), v);
    }


    /** indexed getter for authors - gets an indexed value -
     * @generated
     * @param i index in the array to get
     * @return value of the element at index i
     */
    public String getAuthors(int i) {
        return ((StringArray) (_getFeatureValueNc(wrapGetIntCatchException(_FH_authors)))).get(i);
    }

    /** indexed setter for authors - sets an indexed value -
     * @generated
     * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setAuthors(int i, String v) {
    ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_authors)))).set(i, v);
  }  
  }

    