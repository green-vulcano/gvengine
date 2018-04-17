/*******************************************************************************
 * Copyright (c) 2009, 2016 GreenVulcano ESB Open Source Project.
 * All rights reserved.
 *
 * This file is part of GreenVulcano ESB.
 *
 * GreenVulcano ESB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * GreenVulcano ESB is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with GreenVulcano ESB. If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package it.greenvulcano.gvesb.j2ee.db.utils;

import java.sql.Connection;

/**
 *
 * TxIsolationEnumeration enumeration
 *
 * @version 3.0.0 Feb 17, 2010
 * @author GreenVulcano Developer Team
 *
 *
 */
public enum TxIsolationEnumeration {

    /**
     * @see Connection#TRANSACTION_NONE
     */
    TRANSACTION_NONE(Connection.TRANSACTION_NONE),

    /**
     * @see Connection#TRANSACTION_READ_COMMITTED
     */
    TRANSACTION_READ_COMMITTED(Connection.TRANSACTION_READ_COMMITTED),

    /**
     * @see Connection#TRANSACTION_READ_UNCOMMITTED
     */
    TRANSACTION_READ_UNCOMMITTED(Connection.TRANSACTION_READ_UNCOMMITTED),

    /**
     * @see Connection#TRANSACTION_REPEATABLE_READ
     */
    TRANSACTION_REPEATABLE_READ(Connection.TRANSACTION_REPEATABLE_READ),

    /**
     * @see Connection#TRANSACTION_SERIALIZABLE
     */
    TRANSACTION_SERIALIZABLE(Connection.TRANSACTION_SERIALIZABLE);

    private int id;

    private TxIsolationEnumeration(int id)
    {
        this.id = id;
    }

    /**
     * @return the corresponding value
     */
    public int getId()
    {
        return id;
    }
}
