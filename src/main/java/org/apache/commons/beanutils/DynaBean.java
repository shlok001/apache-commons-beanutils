/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.apache.commons.beanutils;


/**
 * <p>A <strong>DynaBean</strong> is a Java object that supports properties
 * whose names and data types, as well as values, may be dynamically modified.
 * To the maximum degree feasible, other components of the BeanUtils package
 * will recognize such beans and treat them as standard JavaBeans for the
 * purpose of retrieving and setting property values.</p>
 *
 * @author Craig McClanahan
 * @author Paulo Gaspar
 * @version $Revision: 555824 $ $Date: 2007-07-13 02:27:15 +0200 (Fri, 13 Jul 2007) $
 */

public interface DynaBean {


    /**
     * Does the specified mapped property contain a value for the specified
     * key value?
     *
     * @param name Name of the property to check
     * @param key Name of the key to check
     * @return <code>true<code> if the mapped property contains a value for
     * the specified key, otherwise <code>false</code>
     *
     * @exception IllegalArgumentException if there is no property
     *  of the specified name
     */
    public boolean contains(String name, String key) throws IllegalArgumentException;


    /**
     * Return the value of a simple property with the specified name.
     *
     * @param name Name of the property whose value is to be retrieved
     * @return The property's value
     *
     * @exception IllegalArgumentException if there is no property
     *  of the specified name
     */
    public Object get(String name) throws IllegalArgumentException;


    /**
     * Return the value of an indexed property with the specified name.
     *
     * @param name Name of the property whose value is to be retrieved
     * @param index Index of the value to be retrieved
     * @return The indexed property's value
     *
     * @exception IllegalArgumentException if there is no property
     *  of the specified name
     * @exception IllegalArgumentException if the specified property
     *  exists, but is not indexed
     * @exception IndexOutOfBoundsException if the specified index
     *  is outside the range of the underlying property
     * @exception NullPointerException if no array or List has been
     *  initialized for this property
     */
    public Object get(String name, int index) throws IllegalArgumentException, IndexOutOfBoundsException, NullPointerException;


    /**
     * Return the value of a mapped property with the specified name,
     * or <code>null</code> if there is no value for the specified key.
     *
     * @param name Name of the property whose value is to be retrieved
     * @param key Key of the value to be retrieved
     * @return The mapped property's value
     *
     * @exception IllegalArgumentException if there is no property
     *  of the specified name
     * @exception IllegalArgumentException if the specified property
     *  exists, but is not mapped
     */
    public Object get(String name, String key) throws IllegalArgumentException;


    /**
     * Return the <code>DynaClass</code> instance that describes the set of
     * properties available for this DynaBean.
     *
     * @return The associated DynaClass, never null
     */
    public DynaClass getDynaClass();


    /**
     * Remove any existing value for the specified key on the
     * specified mapped property.
     *
     * @param name Name of the property for which a value is to
     *  be removed
     * @param key Key of the value to be removed
     *
     * @exception IllegalArgumentException if there is no property
     *  of the specified name
     */
    public void remove(String name, String key) throws IllegalArgumentException;


    /**
     * Set the value of a simple property with the specified name.
     *
     * @param name Name of the property whose value is to be set
     * @param value Value to which this property is to be set
     *
     * @exception ConversionException if the specified value cannot be
     *  converted to the type required for this property
     * @exception IllegalArgumentException if there is no property
     *  of the specified name
     * @exception NullPointerException if an attempt is made to set a
     *  primitive property to null
     */
    public void set(String name, Object value) throws ConversionException, IllegalArgumentException, NullPointerException;


    /**
     * Set the value of an indexed property with the specified name.
     *
     * @param name Name of the property whose value is to be set
     * @param index Index of the property to be set
     * @param value Value to which this property is to be set
     *
     * @exception ConversionException if the specified value cannot be
     *  converted to the type required for this property
     * @exception IllegalArgumentException if there is no property
     *  of the specified name
     * @exception IllegalArgumentException if the specified property
     *  exists, but is not indexed
     * @exception IndexOutOfBoundsException if the specified index
     *  is outside the range of the underlying property
     */
    public void set(String name, int index, Object value) throws ConversionException, IllegalArgumentException, IndexOutOfBoundsException;


    /**
     * Set the value of a mapped property with the specified name.
     *
     * @param name Name of the property whose value is to be set
     * @param key Key of the property to be set
     * @param value Value to which this property is to be set
     *
     * @exception ConversionException if the specified value cannot be
     *  converted to the type required for this property
     * @exception IllegalArgumentException if there is no property
     *  of the specified name
     * @exception IllegalArgumentException if the specified property
     *  exists, but is not mapped
     */
    public void set(String name, String key, Object value) throws ConversionException, IllegalArgumentException;


}
