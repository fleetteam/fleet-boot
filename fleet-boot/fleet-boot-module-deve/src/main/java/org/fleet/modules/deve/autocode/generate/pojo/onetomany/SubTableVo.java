package org.fleet.modules.deve.autocode.generate.pojo.onetomany;

import org.fleet.modules.deve.autocode.generate.pojo.ColumnVo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SubTableVo {
    private String entityPackage;

    private String tableName;

    private String entityName;

    private String primaryKeyPolicy;

    private String sequenceCode;

    private String ftlDescription;

    private String[] originalForeignKeys;

    private String[] originalForeignMainKeys;

    private String[] foreignKeys;

    private String[] foreignMainKeys;

    private String foreignRelationType;

    private List<ColumnVo> colums;

    private List<ColumnVo> originalColumns;

    private Map<?, ?> extendParams;

    public Map<?, ?> getExtendParams() {
        return this.extendParams;
    }

    public void setExtendParams(Map<?, ?> extendParams) {
        this.extendParams = extendParams;
    }

    public String getEntityPackage() {
        return this.entityPackage;
    }

    public void setEntityPackage(String entityPackage) {
        this.entityPackage = entityPackage;
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getEntityName() {
        return this.entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String[] getOriginalForeignMainKeys() {
        return this.originalForeignMainKeys;
    }

    public void setOriginalForeignMainKeys(String[] originalForeignMainKeys) {
        this.originalForeignMainKeys = originalForeignMainKeys;
    }

    public String[] getForeignMainKeys() {
        return this.foreignMainKeys;
    }

    public void setForeignMainKeys(String[] foreignMainKeys) {
        this.foreignMainKeys = foreignMainKeys;
    }

    public String getFtlDescription() {
        return this.ftlDescription;
    }

    public void setFtlDescription(String ftlDescription) {
        this.ftlDescription = ftlDescription;
    }

    public List<ColumnVo> getColums() {
        return this.colums;
    }

    public void setColums(List<ColumnVo> colums) {
        this.colums = colums;
    }

    public String[] getForeignKeys() {
        return this.foreignKeys;
    }

    public void setForeignKeys(String[] foreignKeys) {
        this.foreignKeys = foreignKeys;
    }

    public String getPrimaryKeyPolicy() {
        return this.primaryKeyPolicy;
    }

    public void setPrimaryKeyPolicy(String primaryKeyPolicy) {
        this.primaryKeyPolicy = primaryKeyPolicy;
    }

    public String getSequenceCode() {
        return this.sequenceCode;
    }

    public void setSequenceCode(String sequenceCode) {
        this.sequenceCode = sequenceCode;
    }

    public List<ColumnVo> getOriginalColumns() {
        return this.originalColumns;
    }

    public void setOriginalColumns(List<ColumnVo> originalColumns) {
        this.originalColumns = originalColumns;
    }

    public String[] getOriginalForeignKeys() {
        return this.originalForeignKeys;
    }

    @Deprecated
    public void setOriginalForeignKeys(String[] originalForeignKeys) {
        this.originalForeignKeys = originalForeignKeys;
    }

    public String getForeignRelationType() {
        return this.foreignRelationType;
    }

    public void setForeignRelationType(String foreignRelationType) {
        this.foreignRelationType = foreignRelationType;
    }

    public String toString() {
        return "{\"entityPackage\":\"" + this.entityPackage + "\",\"tableName\":\"" + this.tableName + "\",\"entityName\":\"" + this.entityName + "\",\"primaryKeyPolicy\":\"" + this.primaryKeyPolicy + "\",\"sequenceCode\":\"" + this.sequenceCode + "\",\"ftlDescription\":\"" + this.ftlDescription + "\",\"originalForeignKeys\":\"" +
                Arrays.toString((Object[]) this.originalForeignKeys) + "\",\"foreignKeys\":\"" +
                Arrays.toString((Object[]) this.foreignKeys) + "\",\"colums\":" + this.colums + ",\"originalColumns\":" + this.originalColumns + "}";
    }
}
