/*
 * This file is generated by jOOQ.
 */
package jooq.steve.db.tables.records;


import javax.annotation.processing.Generated;

import jooq.steve.db.tables.ConnectorChargingProfile;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.15.1",
        "schema version:1.0.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConnectorChargingProfileRecord extends TableRecordImpl<ConnectorChargingProfileRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>stevedb.connector_charging_profile.connector_pk</code>.
     */
    public ConnectorChargingProfileRecord setConnectorPk(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>stevedb.connector_charging_profile.connector_pk</code>.
     */
    public Integer getConnectorPk() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>stevedb.connector_charging_profile.charging_profile_pk</code>.
     */
    public ConnectorChargingProfileRecord setChargingProfilePk(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>stevedb.connector_charging_profile.charging_profile_pk</code>.
     */
    public Integer getChargingProfilePk() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ConnectorChargingProfile.CONNECTOR_CHARGING_PROFILE.CONNECTOR_PK;
    }

    @Override
    public Field<Integer> field2() {
        return ConnectorChargingProfile.CONNECTOR_CHARGING_PROFILE.CHARGING_PROFILE_PK;
    }

    @Override
    public Integer component1() {
        return getConnectorPk();
    }

    @Override
    public Integer component2() {
        return getChargingProfilePk();
    }

    @Override
    public Integer value1() {
        return getConnectorPk();
    }

    @Override
    public Integer value2() {
        return getChargingProfilePk();
    }

    @Override
    public ConnectorChargingProfileRecord value1(Integer value) {
        setConnectorPk(value);
        return this;
    }

    @Override
    public ConnectorChargingProfileRecord value2(Integer value) {
        setChargingProfilePk(value);
        return this;
    }

    @Override
    public ConnectorChargingProfileRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ConnectorChargingProfileRecord
     */
    public ConnectorChargingProfileRecord() {
        super(ConnectorChargingProfile.CONNECTOR_CHARGING_PROFILE);
    }

    /**
     * Create a detached, initialised ConnectorChargingProfileRecord
     */
    public ConnectorChargingProfileRecord(Integer connectorPk, Integer chargingProfilePk) {
        super(ConnectorChargingProfile.CONNECTOR_CHARGING_PROFILE);

        setConnectorPk(connectorPk);
        setChargingProfilePk(chargingProfilePk);
    }
}