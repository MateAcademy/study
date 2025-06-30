package com.klunniy.sodix;

import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Params params = new Params();
        
        
        FieldProps fieldProps = new FieldProps();
        fieldProps.setSodixField(SodixFieldsEnum.EDUCATION_LEVEL);
        fieldProps.setConnectorField(null);

        params.setFieldProps(Arrays.asList(fieldProps));

        Set<String> strings = Set.of(
            params.getFieldProps().stream()
                .filter(x -> x.getSodixField() == SodixFieldsEnum.EDUCATION_LEVEL)
                .map(FieldProps::getConnectorField)
                .filter(Objects::nonNull)  // Отбрасываем null
                .findFirst()
                .orElse("YYY")
        );
        System.out.println(strings);
    }
}


class Params {
   
    private String tenant;
    private String connectionUrl;
    private String sourceId;
    private List<String> publisherIds;
    private List<FieldProps> fieldProps;

    public Params() {
    }

    public Params(String tenant, String connectionUrl, String sourceId, List<String> publisherIds, List<FieldProps> fieldProps
                  ) {
        
        this.tenant = tenant;
        this.connectionUrl = connectionUrl;
        this.sourceId = sourceId;
        this.publisherIds = publisherIds;
        this.fieldProps = fieldProps;
       
    }



    public String getConnectionUrl() {
        return connectionUrl;
    }

    public List<FieldProps> getFieldProps() {
        return fieldProps;
    }

    public String getSourceId() {
        return sourceId;
    }

    public List<String> getPublisherIds() {
        return publisherIds;
    }

    public void setPublisherIds(List<String> publisherIds) {
        this.publisherIds = publisherIds;
    }



    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public void setFieldProps(List<FieldProps> fieldProps) {
        this.fieldProps = fieldProps;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    
}

enum SodixFieldsEnum {
        TITLE,
    DESCRIPTION,
        EDUCATION_LEVEL
     

}

class FieldProps {
    private SodixFieldsEnum sodixField;
    private String connectorField;
    private boolean lock;
    private List<String> defaultValue;

    public FieldProps() {
    }

    public FieldProps(SodixFieldsEnum sodixField, String connectorField, boolean lock, List<String> defaultValue) {
        this.sodixField = sodixField;
        this.connectorField = connectorField;
        this.lock = lock;
        this.defaultValue = defaultValue;
    }

    public SodixFieldsEnum getSodixField() {
        return sodixField;
    }

    public void setSodixField(SodixFieldsEnum sodixField) {
        this.sodixField = sodixField;
    }

    public String getConnectorField() {
        return connectorField;
    }

    public void setConnectorField(String connectorField) {
        this.connectorField = connectorField;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public List<String> getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(List<String> defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FieldProps that = (FieldProps) o;
        return lock == that.lock && Objects.equals(sodixField, that.sodixField) && Objects.equals(connectorField, that.connectorField) && Objects.equals(defaultValue, that.defaultValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sodixField, connectorField, lock, defaultValue);
    }

    @Override
    public String toString() {
        return "FieldProps{" +
            "sodixField='" + sodixField + '\'' +
            ", connectorField='" + connectorField + '\'' +
            ", lock=" + lock +
            ", defaultValue=" + defaultValue +
            '}';
    }
}

