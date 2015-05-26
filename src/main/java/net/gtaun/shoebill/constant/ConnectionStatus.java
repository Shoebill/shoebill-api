package net.gtaun.shoebill.constant;

/**
 * Created by marvin on 14.05.15 in project shoebill-api.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public enum ConnectionStatus {
    NO_ACTION,
    DISCONNECT_ASAP,
    DISCONNECT_ASAP_SILENTLY,
    DISCONNECT_ON_NO_ACK,
    REQUESTED_CONNECTION,
    HANDLING_CONNECTION_REQUEST,
    UNVERIFIED_SENDER,
    SET_ENCRYPTION_ON_MULTIPLE_16_BYTE_PACKET,
    CONNECTED
}
