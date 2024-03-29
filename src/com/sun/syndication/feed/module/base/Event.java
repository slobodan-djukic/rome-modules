/*
 * Event.java
 *
 * Created on November 16, 2005, 11:38 AM
 *
 * This library is provided under dual licenses.
 * You may choose the terms of the Lesser General Public License or the Apache
 * License at your discretion.
 *
 *  Copyright (C) 2005  Robert Cooper, Temple of the Screaming Penguin
 *
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sun.syndication.feed.module.base;

import com.sun.syndication.feed.module.base.types.CurrencyEnumeration;
import com.sun.syndication.feed.module.base.types.DateTimeRange;
import com.sun.syndication.feed.module.base.types.FloatUnit;
import com.sun.syndication.feed.module.base.types.PaymentTypeEnumeration;
import com.sun.syndication.feed.module.base.types.PriceTypeEnumeration;
import com.sun.syndication.feed.module.base.types.ShippingType;


/**
 * This is an interface for the GoogleBase plug in that exposes methods used for
 * Event entry types.
 * @author <a href="mailto:cooper@screaming-penguin.com">Robert "kebernet" Cooper</a>
 * @version $Revision: 1.1 $
 */
public interface Event extends GlobalInterface {
    /**
     * Currency  of the price amount for an item.
     *
     *        <table border="1" cellpadding="5" cellspacing="0" width="640">
     *          <tbody><tr valign="top">
     *            <td colspan="2" bgcolor="#dddddd" valign="top"> <font size="-1"><b><a name="currency"></a>currency</b></font></td>
     *
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Details</b></font></td>
     *
     *            <td> <font size="-1">Currency
     *                of the price amount for an item. Values must be in <a href="http://www.iso.org/iso/en/prods-services/popstds/currencycodeslist.html">ISO
     *                4217</a> currency code format.</font></td>
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Example</b></font></td>
     *
     *            <td> <font size="-1"><em>Acceptable:</em><br>&lt;g:currency&gt;USD&lt;/g:currency&gt;<br>
     *
     *            <em>Not acceptable:</em><br>&lt;g:currency&gt;US Dollars&lt;/g:currency&gt;</font></td>
     *          </tr>
     *          <tr valign="top">
     *
     *            <td width="120"> <font size="-1"><b>Attribute
     *                of</b></font></td>
     *            <td> <font size="-1">Events,
     *                Housing, Products, Services, Travel, Vehicles</font></td>
     *
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Content
     *                type</b></font></td>
     *            <td> <font size="-1">currencyEnumeration</font></td>
     *
     *          </tr>
     *        </tbody></table>
     * @param value Currency  of the price amount for an item.
     */
    public void setCurrency(CurrencyEnumeration value);

    /**
     * Currency  of the price amount for an item.
     *
     *        <table border="1" cellpadding="5" cellspacing="0" width="640">
     *          <tbody><tr valign="top">
     *            <td colspan="2" bgcolor="#dddddd" valign="top"> <font size="-1"><b><a name="currency"></a>currency</b></font></td>
     *
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Details</b></font></td>
     *
     *            <td> <font size="-1">Currency
     *                of the price amount for an item. Values must be in <a href="http://www.iso.org/iso/en/prods-services/popstds/currencycodeslist.html">ISO
     *                4217</a> currency code format.</font></td>
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Example</b></font></td>
     *
     *            <td> <font size="-1"><em>Acceptable:</em><br>&lt;g:currency&gt;USD&lt;/g:currency&gt;<br>
     *
     *            <em>Not acceptable:</em><br>&lt;g:currency&gt;US Dollars&lt;/g:currency&gt;</font></td>
     *          </tr>
     *          <tr valign="top">
     *
     *            <td width="120"> <font size="-1"><b>Attribute
     *                of</b></font></td>
     *            <td> <font size="-1">Events,
     *                Housing, Products, Services, Travel, Vehicles</font></td>
     *
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Content
     *                type</b></font></td>
     *            <td> <font size="-1">currencyEnumeration</font></td>
     *
     *          </tr>
     *        </tbody></table>
     * @return Currency  of the price amount for an item.
     */
    public CurrencyEnumeration getCurrency();

    /**
     * Additional instructions to explain the item’s delivery process.
     *
     *    <table border="1" cellpadding="5" cellspacing="0" width="640">
     *          <tbody><tr valign="top">
     *            <td colspan="2" bgcolor="#dddddd" valign="top"> <font size="-1"><b><a name="delivery_notes"></a>delivery_notes</b></font></td>
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Details</b></font></td>
     *
     *            <td> <font size="-1">Additional instructions to explain the item’s delivery process.</font></td>
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"><font size="-1"><b>Example</b></font></td>
     *            <td>
     *              <font size="-1">&lt;g:delivery_notes&gt;Items usually shipped within 24 hours.&lt;g:/delivery_notes&gt;<br>
     *
     *              </font></td>
     *
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Attribute
     *                of</b></font></td>
     *            <td>
     *                         <font size="-1">Events, Products, Reviews, Services, Travel, Vehicles, Wanted
     *                Ads. </font></td>
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Content
     *                type</b></font></td>
     *
     *            <td>  <font size="-1">string</font></td>
     *          </tr>
     *        </tbody></table>
     * @param deliveryNotes Additional instructions to explain the item’s delivery process.
     */
    public void setDeliveryNotes(String deliveryNotes);

    /**
     * Additional instructions to explain the item’s delivery process.
     *
     *    <table border="1" cellpadding="5" cellspacing="0" width="640">
     *          <tbody><tr valign="top">
     *            <td colspan="2" bgcolor="#dddddd" valign="top"> <font size="-1"><b><a name="delivery_notes"></a>delivery_notes</b></font></td>
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Details</b></font></td>
     *
     *            <td> <font size="-1">Additional instructions to explain the item’s delivery process.</font></td>
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"><font size="-1"><b>Example</b></font></td>
     *            <td>
     *              <font size="-1">&lt;g:delivery_notes&gt;Items usually shipped within 24 hours.&lt;g:/delivery_notes&gt;<br>
     *
     *              </font></td>
     *
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Attribute
     *                of</b></font></td>
     *            <td>
     *                         <font size="-1">Events, Products, Reviews, Services, Travel, Vehicles, Wanted
     *                Ads. </font></td>
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Content
     *                type</b></font></td>
     *
     *            <td>  <font size="-1">string</font></td>
     *          </tr>
     *        </tbody></table>
     * @return Additional instructions to explain the item’s delivery process.
     */
    public String getDeliveryNotes();

    /**
     * The maximum distance you will deliver an item in any direction.
     *        <table border="1" cellpadding="5" cellspacing="0" width="640">
     *          <tbody><tr valign="top">
     *            <td colspan="2" bgcolor="#dddddd" valign="top"> <font size="-1"><b><a name="delivery_radius"></a>delivery_radius</b></font></td>
     *
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Details</b></font></td>
     *            <td> <font size="-1">The maximum
     *                distance you will deliver an item in any direction. </font></td>
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"><font size="-1"><b>Example</b></font></td>
     *
     *            <td>
     *              <font size="-1">&lt;g:delivery_radius&gt;10&lt;g:/delivery_radius&gt;
     *              </font>
     *        <br><font size="-1">&lt;g:delivery_radius&gt;10km&lt;/g:delivery_radius&gt;</font></td>
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Attribute
     *                of</b></font></td>
     *
     *            <td>
     *                         <font size="-1">Events, Products, Reviews, Services, Travel, Vehicles, Wanted
     *                Ads. </font></td>
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Content
     *                type</b></font></td>
     *            <td>  <font size="-1">floatUnit</font></td>
     *          </tr>
     *
     *        </tbody></table>
     * @param deliveryRadius The maximum distance you will deliver an item in any direction.
     */
    public void setDeliveryRadius(FloatUnit deliveryRadius);

    /**
     * The maximum distance you will deliver an item in any direction.
     *        <table border="1" cellpadding="5" cellspacing="0" width="640">
     *          <tbody><tr valign="top">
     *            <td colspan="2" bgcolor="#dddddd" valign="top"> <font size="-1"><b><a name="delivery_radius"></a>delivery_radius</b></font></td>
     *
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Details</b></font></td>
     *            <td> <font size="-1">The maximum
     *                distance you will deliver an item in any direction. </font></td>
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"><font size="-1"><b>Example</b></font></td>
     *
     *            <td>
     *              <font size="-1">&lt;g:delivery_radius&gt;10&lt;g:/delivery_radius&gt;
     *              </font>
     *        <br><font size="-1">&lt;g:delivery_radius&gt;10km&lt;/g:delivery_radius&gt;</font></td>
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Attribute
     *                of</b></font></td>
     *
     *            <td>
     *                         <font size="-1">Events, Products, Reviews, Services, Travel, Vehicles, Wanted
     *                Ads. </font></td>
     *          </tr>
     *          <tr valign="top">
     *            <td width="120"> <font size="-1"><b>Content
     *                type</b></font></td>
     *            <td>  <font size="-1">floatUnit</font></td>
     *          </tr>
     *
     *        </tbody></table>
     * @return The maximum distance you will deliver an item in any direction.
     */
    public FloatUnit getDeliveryRadius();

    /**
     * The time during which this event takes place.
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *  <b><a name="event_date_range"></a>event_date_range</b></font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Details</b></font></td>
     *  <td><font size="-1">
     *
     *  Information on the date and time an
     *  event will take place, in <a href="http://www.iso.org/iso/en/prods-services/popstds/datesandtime.html">ISO 8601</a> format.  Two sub-attributes are included in the event_date_range attribute:<ul type="disc">
     *
     *  <li>from = Date and time an event will begin
     *  in format YYYY-MM-DDThh:mm:ss</li>
     *  <li>to =
     *  (Optional). Date and time an event will end, in format YYYY-MM-DDThh:mm:ss</li></ul></font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Example</b></font></td>
     *  <td><font size="-1"> &lt;g:event_dateTime&gt;<br>
     *
     *        &lt;g:from&gt;2005-12-20T14:00:00&lt;/g:from&gt;<br>
     *        &lt;g:to&gt;2005-12-20T19:00:00&lt;/g:to&gt;<br>
     *
     * &lt;/g:eventdateTime&gt;</font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *  <td><font size="-1">
     *  Events</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *
     *  <td><font size="-1">
     *  dateTimeRange</font></td>
     * </tr>
     *
     * </tbody></table>
     * @param eventDateRange The time during which this event takes place.
     */
    public void setEventDateRange(DateTimeRange eventDateRange);

    /**
     * The time during which this event takes place.
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *  <b><a name="event_date_range"></a>event_date_range</b></font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Details</b></font></td>
     *  <td><font size="-1">
     *
     *  Information on the date and time an
     *  event will take place, in <a href="http://www.iso.org/iso/en/prods-services/popstds/datesandtime.html">ISO 8601</a> format.  Two sub-attributes are included in the event_date_range attribute:<ul type="disc">
     *
     *  <li>from = Date and time an event will begin
     *  in format YYYY-MM-DDThh:mm:ss</li>
     *  <li>to =
     *  (Optional). Date and time an event will end, in format YYYY-MM-DDThh:mm:ss</li></ul></font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Example</b></font></td>
     *  <td><font size="-1"> &lt;g:event_dateTime&gt;<br>
     *
     *        &lt;g:from&gt;2005-12-20T14:00:00&lt;/g:from&gt;<br>
     *        &lt;g:to&gt;2005-12-20T19:00:00&lt;/g:to&gt;<br>
     *
     * &lt;/g:eventdateTime&gt;</font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *  <td><font size="-1">
     *  Events</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *
     *  <td><font size="-1">
     *  dateTimeRange</font></td>
     * </tr>
     *
     * </tbody></table>
     * @return The time during which this event takes place.
     */
    public DateTimeRange getEventDateRange();

    /**
     * Location where the event will be held.
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *  <b><a name="location"></a>location</b></font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Details</b></font></td>
     *  <td><font size="-1"> Location of a property. Should
     *  include street, city, state, postal code, and country, in that order. </font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Example</b></font></td>
     *
     *  <td><font size="-1">
     *  <em>Acceptable:</em><br>
     * &lt;g:location&gt;<st1:place>123 Main St, <st1:city>Anytown</st1:city>, <st1:state>CA</st1:state>, <st1:postalcode>12345</st1:postalcode>, <st1:country-region>USA</st1:country-region></st1:place>&lt;/g:location&gt;<br>
     *
     * <em>Not acceptable:</em><br>
     * &lt;g:location&gt;<st1:place><st1:city>123</st1:city> Main St,, <st1:state>CA</st1:state>, <st1:postalcode>12345</st1:postalcode>, <st1:country-region>USA</st1:country-region></st1:place>&lt;/g:location&gt;<br>
     * &lt;g:location&gt;
     *  <st1:place><st1:city>Anytown</st1:city>, <st1:state>CA</st1:state>, <st1:postalcode>12345</st1:postalcode>, <st1:country-region>USA</st1:country-region></st1:place>&lt;/g:location&gt;</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *  <td><font size="-1">
     *  Reference Items, Events, Housing, Jobs, News and Articles,
     *  People profiles, Products, Reviews, Services, Travel, Vehicles, Wanted Ads.</font></td>
     * </tr>
     *
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *  <td><font size="-1">
     *  locationType</font></td>
     *          </tr>
     *        </tbody></table>
     * @param location Location where the event will be held.
     */
    public void setLocation(String location);

    /**
     * Location where the event will be held.
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *  <b><a name="location"></a>location</b></font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Details</b></font></td>
     *  <td><font size="-1"> Location of a property. Should
     *  include street, city, state, postal code, and country, in that order. </font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Example</b></font></td>
     *
     *  <td><font size="-1">
     *  <em>Acceptable:</em><br>
     * &lt;g:location&gt;<st1:place>123 Main St, <st1:city>Anytown</st1:city>, <st1:state>CA</st1:state>, <st1:postalcode>12345</st1:postalcode>, <st1:country-region>USA</st1:country-region></st1:place>&lt;/g:location&gt;<br>
     *
     * <em>Not acceptable:</em><br>
     * &lt;g:location&gt;<st1:place><st1:city>123</st1:city> Main St,, <st1:state>CA</st1:state>, <st1:postalcode>12345</st1:postalcode>, <st1:country-region>USA</st1:country-region></st1:place>&lt;/g:location&gt;<br>
     * &lt;g:location&gt;
     *  <st1:place><st1:city>Anytown</st1:city>, <st1:state>CA</st1:state>, <st1:postalcode>12345</st1:postalcode>, <st1:country-region>USA</st1:country-region></st1:place>&lt;/g:location&gt;</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *  <td><font size="-1">
     *  Reference Items, Events, Housing, Jobs, News and Articles,
     *  People profiles, Products, Reviews, Services, Travel, Vehicles, Wanted Ads.</font></td>
     * </tr>
     *
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *  <td><font size="-1">
     *  locationType</font></td>
     *          </tr>
     *        </tbody></table>
     * @return Location where the event will be held.
     */
    public String getLocation();

    /**
     * Payment Methods acceptable for the event.
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     *
     * <tbody><tr valign="top">
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *  <b><a name="payment_accepted"></a>payment_accepted</b></font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Details</b></font></td>
     *  <td><font size="-1"> Acceptable payment methods for item purchases. Acceptable
     *  values are "Cash," "Check," "Traveler’s Check," "Visa," "MasterCard,"
     *
     *  "American Express," "Discover," "Wire transfer" or "Paypal." If you accept
     *  more than one method, include multiple instances of the
     *  &lt;payment_accepted&gt; attribute for each acceptable method.</font></td>
     *
     * </tr>
     *
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Example</b></font></td>
     *  <td><font size="-1">
     * <em>Acceptable:</em><br>
     * &lt;g:payment_accepted&gt;Cash&lt;/g:payment_accepted&gt;<br>
     *
     * &lt;g:payment_accepted&gt;Check&lt;/g:payment_accepted&gt;<br>
     *
     * &lt;g:payment_accepted&gt;Paypal&lt;/g:payment_accepted&gt;<br>
     * <em>Not acceptable:</em><br>
     * &lt;g:payment_accepted&gt;Cash
     *  Check Paypal&lt;/g:payment_accepted&gt;</font></td>
     * </tr>
     *
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *
     *  <td><font size="-1">
     *  Events, Housing,
     *  Products, Services, Travel, Vehicles</font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *  <td><font size="-1">
     *  paymentMethodEnumeration</font></td>
     *
     * </tr>
     * </tbody></table>
     * @param paymentAccepted Payment Methods acceptable for the event.
     */
    public void setPaymentAccepted(PaymentTypeEnumeration[] paymentAccepted);

    /**
     * Payment Methods acceptable for the event.
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     *
     * <tbody><tr valign="top">
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *  <b><a name="payment_accepted"></a>payment_accepted</b></font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Details</b></font></td>
     *  <td><font size="-1"> Acceptable payment methods for item purchases. Acceptable
     *  values are "Cash," "Check," "Traveler’s Check," "Visa," "MasterCard,"
     *
     *  "American Express," "Discover," "Wire transfer" or "Paypal." If you accept
     *  more than one method, include multiple instances of the
     *  &lt;payment_accepted&gt; attribute for each acceptable method.</font></td>
     *
     * </tr>
     *
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Example</b></font></td>
     *  <td><font size="-1">
     * <em>Acceptable:</em><br>
     * &lt;g:payment_accepted&gt;Cash&lt;/g:payment_accepted&gt;<br>
     *
     * &lt;g:payment_accepted&gt;Check&lt;/g:payment_accepted&gt;<br>
     *
     * &lt;g:payment_accepted&gt;Paypal&lt;/g:payment_accepted&gt;<br>
     * <em>Not acceptable:</em><br>
     * &lt;g:payment_accepted&gt;Cash
     *  Check Paypal&lt;/g:payment_accepted&gt;</font></td>
     * </tr>
     *
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *
     *  <td><font size="-1">
     *  Events, Housing,
     *  Products, Services, Travel, Vehicles</font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *  <td><font size="-1">
     *  paymentMethodEnumeration</font></td>
     *
     * </tr>
     * </tbody></table>
     * @return Payment Methods acceptable for the event.
     */
    public PaymentTypeEnumeration[] getPaymentAccepted();

    /**
     * Additional information about payment.
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *  <b><a name="payment_notes"></a>payment_notes</b></font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Details</b></font></td>
     *
     *  <td><font size="-1">
     *  Additional instructions to explain
     *  a payment policy.</font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Example</b></font></td>
     *
     *  <td><font size="-1"> &lt;g:payment_notes&gt;Cash only for local orders.&lt;/g:payment_notes&gt;</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *  <td><font size="-1">
     *
     *  Events,
     *  Housing, Products, Services, Travel, Vehicles</font></td>
     * </tr>
     *
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *  <td><font size="-1">
     *  string</font></td>
     *
     * </tr>
     * </tbody></table>
     *
     *
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *  <b><a name="payment_notes"></a>payment_notes</b></font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Details</b></font></td>
     *
     *  <td><font size="-1">
     *  Additional instructions to explain
     *  a payment policy.</font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Example</b></font></td>
     *
     *  <td><font size="-1"> &lt;g:payment_notes&gt;Cash only for local orders.&lt;/g:payment_notes&gt;</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *  <td><font size="-1">
     *
     *  Events,
     *  Housing, Products, Services, Travel, Vehicles</font></td>
     * </tr>
     *
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *  <td><font size="-1">
     *  string</font></td>
     *
     * </tr>
     * </tbody></table>
     *
     *
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *  <b><a name="payment_notes"></a>payment_notes</b></font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Details</b></font></td>
     *
     *  <td><font size="-1">
     *  Additional instructions to explain
     *  a payment policy.</font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Example</b></font></td>
     *
     *  <td><font size="-1"> &lt;g:payment_notes&gt;Cash only for local orders.&lt;/g:payment_notes&gt;</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *  <td><font size="-1">
     *
     *  Events,
     *  Housing, Products, Services, Travel, Vehicles</font></td>
     * </tr>
     *
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *  <td><font size="-1">
     *  string</font></td>
     *
     * </tr>
     * </tbody></table>
     * @param paymentNotes Additional information about payment.
     */
    public void setPaymentNotes(String paymentNotes);

    /**
     * Additional information about payment.
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *  <b><a name="payment_notes"></a>payment_notes</b></font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Details</b></font></td>
     *
     *  <td><font size="-1">
     *  Additional instructions to explain
     *  a payment policy.</font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Example</b></font></td>
     *
     *  <td><font size="-1"> &lt;g:payment_notes&gt;Cash only for local orders.&lt;/g:payment_notes&gt;</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *  <td><font size="-1">
     *
     *  Events,
     *  Housing, Products, Services, Travel, Vehicles</font></td>
     * </tr>
     *
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *  <td><font size="-1">
     *  string</font></td>
     *
     * </tr>
     * </tbody></table>
     *
     *
     * @return Additional information about payment.
     */
    public String getPaymentNotes();

    /**
     * Price of the event.
     *
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *  <b><a name="price"></a>price</b></font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *
     *  <b>Details</b></font></td>
     *  <td><font size="-1"> Prices can be a single price, 0
     *  (free), or blank if not applicable.  Numerice values only. When used
     *  as a sub-attribute of &lt;shipping&gt;, the value included reflects the price
     *  of shipping.</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Example</b></font></td>
     *
     *  <td><font size="-1">
     * <em>Acceptable:</em><br>
     * &lt;g:price&gt;5.95&lt;/g:price&gt;<br>
     *
     * &lt;g:price&gt;0&lt;/g:price&gt;<br>
     *  <em>Not acceptable:</em><br>
     *
     * &lt;g:price&gt;5,95&lt;/g:price&gt;<br>
     * &lt;g:price&gt;5.00 – 10.00&lt;/g:price&gt;<br>
     *
     * &lt;g:price&gt;100 or best offer&lt;/g:price&gt;<br>
     * &lt;g:price&gt;free&lt;/g:price&gt;</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *
     *  <td><font size="-1">
     *  Events,
     *  Housing, Products, Services, Travel, Vehicles</font></td>
     * </tr>
     *
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *  <td valign="top"><font size="-1">floatUnit</font></td>
     *
     * </tr>
     * </tbody></table>
     * @param price Price of the event.
     */
    public void setPrice(FloatUnit price);

    /**
     * Price of the event.
     *
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *  <b><a name="price"></a>price</b></font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *
     *  <b>Details</b></font></td>
     *  <td><font size="-1"> Prices can be a single price, 0
     *  (free), or blank if not applicable.  Numerice values only. When used
     *  as a sub-attribute of &lt;shipping&gt;, the value included reflects the price
     *  of shipping.</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Example</b></font></td>
     *
     *  <td><font size="-1">
     * <em>Acceptable:</em><br>
     * &lt;g:price&gt;5.95&lt;/g:price&gt;<br>
     *
     * &lt;g:price&gt;0&lt;/g:price&gt;<br>
     *  <em>Not acceptable:</em><br>
     *
     * &lt;g:price&gt;5,95&lt;/g:price&gt;<br>
     * &lt;g:price&gt;5.00 – 10.00&lt;/g:price&gt;<br>
     *
     * &lt;g:price&gt;100 or best offer&lt;/g:price&gt;<br>
     * &lt;g:price&gt;free&lt;/g:price&gt;</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *
     *  <td><font size="-1">
     *  Events,
     *  Housing, Products, Services, Travel, Vehicles</font></td>
     * </tr>
     *
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *  <td valign="top"><font size="-1">floatUnit</font></td>
     *
     * </tr>
     * </tbody></table>
     * @return Price of the event.
     */
    public FloatUnit getPrice();

    /**
     * Price qualifier for the even cost.
     *
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1"><b><a name="price_type"></a>price_type</b></font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1"><b>Details</b></font></td>
     *  <td><font size="-1">The type of pricing for the
     *  item. Acceptable values are "negotiable," or "starting." The default is
     *  "starting"</font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1"><b>Example</b></font></td>
     *  <td><font size="-1"><em>Acceptable:</em><br>
     * &lt;g:price_type&gt;starting&lt;/g:price_type&gt;<br>
     * <em>Not acceptable:</em><br>
     * &lt;g:price_type&gt;100 OBO&lt;/g:price_type&gt;</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *  <td><font size="-1">
     *  Events,
     *  Housing, Products, Services, Travel, Vehicles</font></td>
     * </tr>
     *
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *  <td><font size="-1">
     *  priceTypeEnumeration</font></td>
     * </tr>
     * </tbody></table>
     * @param priceType Price qualifier for the even cost.
     */
    public void setPriceType(PriceTypeEnumeration priceType);

    /**
     * Price qualifier for the even cost.
     *
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1"><b><a name="price_type"></a>price_type</b></font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1"><b>Details</b></font></td>
     *  <td><font size="-1">The type of pricing for the
     *  item. Acceptable values are "negotiable," or "starting." The default is
     *  "starting"</font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1"><b>Example</b></font></td>
     *  <td><font size="-1"><em>Acceptable:</em><br>
     * &lt;g:price_type&gt;starting&lt;/g:price_type&gt;<br>
     * <em>Not acceptable:</em><br>
     * &lt;g:price_type&gt;100 OBO&lt;/g:price_type&gt;</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *  <td><font size="-1">
     *  Events,
     *  Housing, Products, Services, Travel, Vehicles</font></td>
     * </tr>
     *
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *  <td><font size="-1">
     *  priceTypeEnumeration</font></td>
     * </tr>
     * </tbody></table>
     * @return Price qualifier for the even cost.
     */
    public PriceTypeEnumeration getPriceType();

    /**
     * Quantity available.
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *  <b><a name="quantity"></a>quantity</b></font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Details</b></font></td>
     *  <td><font size="-1"> The number of units available for purchase. This
     *  attribute can be left blank if you have a large quantity or if it is not
     *  applicable. </font></td>
     *
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Example</b></font></td>
     *  <td><font size="-1">
     *  <em>Acceptable:</em><br>
     * &lt;g:quantity&gt;18&lt;/g:quantity&gt;<br>
     *
     * &lt;g:quantity&gt;0&lt;/g:quantity&gt;<br>
     *
     *  <em>Not acceptable:</em><br>
     * &lt;g:quantity&gt;out
     *  of stock&lt;/g:quantity&gt;</font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *
     *  <b>Attribute of</b></font></td>
     *
     *  <td><font size="-1">
     *  Events, Products,
     *  Services, Travel, Vehicles</font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *
     *  <td><font size="-1">
     *
     *  integer</font></td>
     * </tr>
     * </tbody></table>
     * @param quantity Quantity available.
     */
    public void setQuantity(Integer quantity);

    /**
     * Quantity available.
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *  <b><a name="quantity"></a>quantity</b></font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Details</b></font></td>
     *  <td><font size="-1"> The number of units available for purchase. This
     *  attribute can be left blank if you have a large quantity or if it is not
     *  applicable. </font></td>
     *
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Example</b></font></td>
     *  <td><font size="-1">
     *  <em>Acceptable:</em><br>
     * &lt;g:quantity&gt;18&lt;/g:quantity&gt;<br>
     *
     * &lt;g:quantity&gt;0&lt;/g:quantity&gt;<br>
     *
     *  <em>Not acceptable:</em><br>
     * &lt;g:quantity&gt;out
     *  of stock&lt;/g:quantity&gt;</font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *
     *  <b>Attribute of</b></font></td>
     *
     *  <td><font size="-1">
     *  Events, Products,
     *  Services, Travel, Vehicles</font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *
     *  <td><font size="-1">
     *
     *  integer</font></td>
     * </tr>
     * </tbody></table>
     * @return Quantity available.
     */
    public Integer getQuantity();

    /**
     * Shipping information related to the event.
     *
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *
     *  <b><a name="shipping"></a>shipping</b></font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Details</b></font></td>
     *
     *  <td><font size="-1">
     *  Shipping options available for an item. Up to 10
     *  shipping options can be included for each item. Three sub-attributes are
     *  included in the shipping attribute:<ul type="disc">
     *
     *  <li>service = The type of service used to ship an item. Acceptable values are 'FedEx', 'UPS', 'DHL', 'Mail', and 'Other'</li>
     *  <li>country = The country an item will ship to. Only acceptable values are<b> </b>ISO 3166 country codes.</li>
     *  <li>price =
     *  the price of shipping.</li></ul></font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *
     *  <b>Example</b></font></td>
     *  <td><font size="-1"> &lt;g:shipping&gt;<br>
     *      &lt;g:country&gt;US&lt;/g:country&gt;<br>
     *
     *      &lt;g:service&gt;UPS&lt;/g:shipping&gt;<br>
     *
     *      &lt;g:price&gt;35.95&lt;/g:price&gt;<br>
     * &lt;/g:shipping&gt;</font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *
     *  <td><font size="-1">
     *  Products</font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *
     *  <b>Content type</b></font></td>
     *  <td><font size="-1">
     *  shippingType</font></td>
     *
     * </tr>
     * </tbody></table>
     * @param shipping Shipping information related to the event.
     */
    public void setShipping(ShippingType[] shipping);

    /**
     * Shipping information related to the event.
     *
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *
     *  <b><a name="shipping"></a>shipping</b></font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Details</b></font></td>
     *
     *  <td><font size="-1">
     *  Shipping options available for an item. Up to 10
     *  shipping options can be included for each item. Three sub-attributes are
     *  included in the shipping attribute:<ul type="disc">
     *
     *  <li>service = The type of service used to ship an item. Acceptable values are 'FedEx', 'UPS', 'DHL', 'Mail', and 'Other'</li>
     *  <li>country = The country an item will ship to. Only acceptable values are<b> </b>ISO 3166 country codes.</li>
     *  <li>price =
     *  the price of shipping.</li></ul></font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *
     *  <b>Example</b></font></td>
     *  <td><font size="-1"> &lt;g:shipping&gt;<br>
     *      &lt;g:country&gt;US&lt;/g:country&gt;<br>
     *
     *      &lt;g:service&gt;UPS&lt;/g:shipping&gt;<br>
     *
     *      &lt;g:price&gt;35.95&lt;/g:price&gt;<br>
     * &lt;/g:shipping&gt;</font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *
     *  <td><font size="-1">
     *  Products</font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *
     *  <b>Content type</b></font></td>
     *  <td><font size="-1">
     *  shippingType</font></td>
     *
     * </tr>
     * </tbody></table>
     * @return Shipping information related to the event.
     */
    public ShippingType[] getShipping();

    /**
     * Tax rate associated with the event.
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *  <b><a name="tax_percent"></a>tax_percent</b></font></td>
     * </tr>
     *
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *
     *  <b>Details</b></font></td>
     *  <td><font size="-1">
     *  Tax rate as a percentage.</font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Example</b></font></td>
     *
     *  <td><font size="-1"> &lt;g:tax_percent&gt;8.2&lt;g:/tax_percent&gt;</font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *
     *  <b>Attribute of</b></font></td>
     *  <td><font size="-1">
     *
     *  Products, Events</font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *
     *  <td><font size="-1">
     *  percentType</font></td>
     *
     * </tr>
     * </tbody></table>
     * @param taxPercent Tax rate associated with the event.
     */
    public void setTaxPercent(Float taxPercent);

    /**
     * Tax rate associated with the event.
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *  <b><a name="tax_percent"></a>tax_percent</b></font></td>
     * </tr>
     *
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *
     *  <b>Details</b></font></td>
     *  <td><font size="-1">
     *  Tax rate as a percentage.</font></td>
     * </tr>
     * <tr valign="top">
     *
     *  <td width="120"><font size="-1">
     *  <b>Example</b></font></td>
     *
     *  <td><font size="-1"> &lt;g:tax_percent&gt;8.2&lt;g:/tax_percent&gt;</font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *
     *  <b>Attribute of</b></font></td>
     *  <td><font size="-1">
     *
     *  Products, Events</font></td>
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *
     *  <td><font size="-1">
     *  percentType</font></td>
     *
     * </tr>
     * </tbody></table>
     * @return Tax rate associated with the event.
     */
    public Float getTaxPercent();

    /**
     * Region where tax applies.
     *
     *
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *
     *  <b><a name="tax_region"></a>tax_region</b></font></td>
     * </tr>
     *
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Details</b></font></td>
     *  <td><font size="-1">
     *  Geographical region a tax rate
     *  applies to.</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *
     *  <b>Example</b></font></td>
     *  <td><font size="-1"> &lt;g:tax_region&gt;California&lt;/g:tax_region&gt;</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *
     *  <td><font size="-1">
     *  Product,
     *  Events,</font></td>
     * </tr>
     *
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *  <td><font size="-1">string</font></td>
     *
     * </tr>
     * </tbody></table>
     * @param taxRegion Region where tax applies.
     */
    public void setTaxRegion(String taxRegion);

    /**
     * Region where tax applies.
     *
     *
     *
     * <table border="1" cellpadding="5" cellspacing="0" width="640">
     * <tbody><tr valign="top">
     *  <td colspan="2" bgcolor="#dddddd" valign="top"><font size="-1">
     *
     *  <b><a name="tax_region"></a>tax_region</b></font></td>
     * </tr>
     *
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Details</b></font></td>
     *  <td><font size="-1">
     *  Geographical region a tax rate
     *  applies to.</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *
     *  <b>Example</b></font></td>
     *  <td><font size="-1"> &lt;g:tax_region&gt;California&lt;/g:tax_region&gt;</font></td>
     *
     * </tr>
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Attribute of</b></font></td>
     *
     *  <td><font size="-1">
     *  Product,
     *  Events,</font></td>
     * </tr>
     *
     * <tr valign="top">
     *  <td width="120"><font size="-1">
     *  <b>Content type</b></font></td>
     *  <td><font size="-1">string</font></td>
     *
     * </tr>
     * </tbody></table>
     * @return Region where tax applies.
     */
    public String getTaxRegion();
}
