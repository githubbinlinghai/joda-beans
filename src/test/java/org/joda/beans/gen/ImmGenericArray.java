/*
 *  Copyright 2001-2013 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.gen;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.BasicImmutableBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(builderScope = "private")
public final class ImmGenericArray<T extends Address> implements ImmutableBean {

    /** The name. */
    @PropertyDefinition(validate = "notNull")
    private final T[] values;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code ImmGenericArray}.
     * @return the meta-bean, not null
     */
    @SuppressWarnings("rawtypes")
    public static ImmGenericArray.Meta meta() {
        return ImmGenericArray.Meta.INSTANCE;
    }

    /**
     * The meta-bean for {@code ImmGenericArray}.
     * @param <R>  the bean's generic type
     * @param cls  the bean's generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R extends Address> ImmGenericArray.Meta<R> metaImmGenericArray(Class<R> cls) {
        return ImmGenericArray.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(ImmGenericArray.Meta.INSTANCE);
    }

    private ImmGenericArray(
            T[] values) {
        JodaBeanUtils.notNull(values, "values");
        this.values = values;
    }

    @SuppressWarnings("unchecked")
    @Override
    public ImmGenericArray.Meta<T> metaBean() {
        return ImmGenericArray.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the name.
     * @return the value of the property, not null
     */
    public T[] getValues() {
        return values;
    }

    //-----------------------------------------------------------------------
    @Override
    public ImmGenericArray<T> clone() {
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            ImmGenericArray<?> other = (ImmGenericArray<?>) obj;
            return JodaBeanUtils.equal(getValues(), other.getValues());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash += hash * 31 + JodaBeanUtils.hashCode(getValues());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(64);
        buf.append("ImmGenericArray{");
        buf.append("values").append('=').append(JodaBeanUtils.toString(getValues()));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code ImmGenericArray}.
     */
    public static final class Meta<T extends Address> extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code values} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<T[]> values = (DirectMetaProperty) DirectMetaProperty.ofImmutable(
                this, "values", ImmGenericArray.class, Object[].class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "values");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case -823812830:  // values
                    return values;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public ImmGenericArray.Builder<T> builder() {
            return new ImmGenericArray.Builder<T>();
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends ImmGenericArray<T>> beanType() {
            return (Class) ImmGenericArray.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code values} property.
         * @return the meta-property, not null
         */
        public MetaProperty<T[]> values() {
            return values;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case -823812830:  // values
                    return ((ImmGenericArray<?>) bean).getValues();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            metaProperty(propertyName);
            if (quiet) {
                return;
            }
            throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
        }

    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code ImmGenericArray}.
     */
    private static final class Builder<T extends Address> extends BasicImmutableBeanBuilder<ImmGenericArray<T>> {

        private T[] values;

        /**
         * Restricted constructor.
         */
        private Builder() {
            super(ImmGenericArray.Meta.INSTANCE);
        }

        //-----------------------------------------------------------------------
        @SuppressWarnings("unchecked")
        @Override
        public Builder<T> set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case -823812830:  // values
                    this.values = (T[]) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public ImmGenericArray<T> build() {
            return new ImmGenericArray<T>(
                    values);
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(64);
            buf.append("ImmGenericArray.Builder{");
            buf.append("values").append('=').append(values);
            buf.append('}');
            return buf.toString();
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
