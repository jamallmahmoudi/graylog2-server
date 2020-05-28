/**
 * This file is part of Graylog.
 *
 * Graylog is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Graylog is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Graylog.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.graylog.schema;

public enum AssociatedFields {
    ASSOCIATED_CATEGORY("associated_category"),
    ASSOCIATED_HASH("associated_hash"),
    ASSOCIATED_HOST("associated_host"),
    ASSOCIATED_IP("associated_ip"),
    ASSOCIATED_MAC("associated_mac"),
    ASSOCIATED_USER_ID("associated_user_id"),
    ASSOCIATED_USER_NAME("associated_user_name");

    private String value;

    AssociatedFields(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
