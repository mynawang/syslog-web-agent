package com.yuhuo.syslog;

import org.productivity.java.syslog4j.Syslog;
import org.productivity.java.syslog4j.SyslogIF;

/**
 * Created by mynawang on 2017/10/31 0031.
 */
public class SyslogSendAll {

    public SyslogSendAll(String ip) {
        SyslogIF syslog = Syslog.getInstance("udp");
        syslog.getConfig().setHost(ip);
        syslog.getConfig().setPort(514);
        while (true) {
            Integer sign = SyslogSendSign.SEND_SIGN.get(ip);
            if (sign == 1) {
                String msg ="soc-relation-test:catBehavior=/Access catOutcome=OK " +
                        "collectorId=" + RandomUtil.getRandomId() + " " +
                        "deviceId=" + RandomUtil.getRandomId() + " " +
                        "deviceCat=" + RandomUtil.getRandomString(15) + " " +
                        "generator=" + RandomUtil.getRandomString(15) + " " +
                        "customer=" + RandomUtil.getRandomString(15) + " " +
                        "vulnerability=" + RandomUtil.getRandomString(15) + " " +
                        "severity=" + (RandomUtil.getRandomId()) + " " +
                        "cltSeverity=" + (RandomUtil.getRandomId()) + " " +
                        "cryptoSignature=" + RandomUtil.getRandomString(15) + " " +
                        "locality=" + RandomUtil.getRandomString(15) + " " +
                        "modelConfidence=" + RandomUtil.getRandomString(15) + " " +
                        "originator=" + RandomUtil.getRandomString(15) + " " +
                        "destHostName=" + RandomUtil.getRandomString(15) + " " +
                        "destServiceName=" + RandomUtil.getRandomString(15) + " " +
                        "destProcessName=" + RandomUtil.getRandomString(15) + " " +
                        "destPort=" + PortUtil.getPort() + " " +
                        "destNtDomain=" + RandomUtil.getRandomString(15) + " " +
                        "destMacAddress=" + IpUtil.getRandomIp() + " " +
                        "destGroupName=" + RandomUtil.getRandomString(15) + " " +
                        "loginTypeRemoteORLocal=" + RandomUtil.getRandomString(15) + " " +
                        "attackSignature=" + RandomUtil.getRandomString(15) + " " +
                        "rawLevel=" + (RandomUtil.getRandomId()) + " " +
                        "thresholdRange=" + RandomUtil.getRandomString(15) + " " +
                        "diskName=" + RandomUtil.getRandomString(15) + " " +
                        "threshold2=" + RandomUtil.getRandomString(15) + " " +
                        "threshold1=" + RandomUtil.getRandomString(15) + " " +
                        "loginName=" + RandomUtil.getRandomString(15) + " " +
                        "loginType=" + RandomUtil.getRandomString(15) + " " +
                        "objectName=" + RandomUtil.getRandomString(15) + " " +
                        "objectType=" + RandomUtil.getRandomString(15) + " " +
                        "categoryType=" + RandomUtil.getRandomString(15) + " " +
                        "secureType=" + RandomUtil.getRandomString(15) + " " +
                        "sourceType=" + RandomUtil.getRandomString(15) + " " +
                        "logType_zh=" + RandomUtil.getRandomString(15) + " " +
                        "eventNum=" + RandomUtil.getRandomString(15) + " " +
                        "userName=" + RandomUtil.getRandomString(15) + " " +
                        "hostName=" + RandomUtil.getRandomString(15) + " " +
                        "deviceAssetSubTypeId=" + RandomUtil.getRandomId() + " " +
                        "deviceAssetSubType=" + RandomUtil.getRandomString(15) + " " +
                        "deviceAssetTypeId=" + RandomUtil.getRandomId() + " " +
                        "deviceAssetType=" + RandomUtil.getRandomString(15) + " " +
                        "availabilityStatus=" + RandomUtil.getRandomString(15) + " " +
                        "integrityStatus=" + RandomUtil.getRandomString(15) + " " +
                        "confidentialityStatus=" + RandomUtil.getRandomString(15) + " " +
                        "availabilitySeverity=" + (RandomUtil.getRandomId()) + " " +
                        "integritySeverity=" + (RandomUtil.getRandomId()) + " " +
                        "confidentialitySeverity=" + (RandomUtil.getRandomId()) + " " +
                        "dvcFacility=" + RandomUtil.getRandomString(15) + " " +
                        "deviceProtocol=" + RandomUtil.getRandomString(15) + " " +
                        "customerId=" + RandomUtil.getRandomId() + " " +
                        "destGeoPostalCode=" + RandomUtil.getRandomString(15) + " " +
                        "srcGeoPostalCode=" + RandomUtil.getRandomString(15) + " " +
                        "destGeoIsp=" + RandomUtil.getRandomString(15) + " " +
                        "srcGeoIsp=" + RandomUtil.getRandomString(15) + " " +
                        "destGeoLongitude=" + RandomUtil.getRandomString(15) + " " +
                        "destGeoLatitude=" + RandomUtil.getRandomString(15) + " " +
                        "srcGeoLongitude=" + RandomUtil.getRandomString(15) + " " +
                        "srcGeoLatitude=" + RandomUtil.getRandomString(15) + " " +
                        "destGeoAddress=" + IpUtil.getRandomIp() + " " +
                        "srcGeoAddress=" + IpUtil.getRandomIp() + " " +
                        "destGeoCounty=" + RandomUtil.getRandomString(15) + " " +
                        "srcGeoCounty=" + RandomUtil.getRandomString(15) + " " +
                        "destGeoCity=" + RandomUtil.getRandomString(15) + " " +
                        "destGeoRegionCode=" + RandomUtil.getRandomString(15) + " " +
                        "destGeoRegion=" + RandomUtil.getRandomString(15) + " " +
                        "destGeoCountryCode=" + RandomUtil.getRandomString(15) + " " +
                        "destGeoCountry=" + RandomUtil.getRandomString(15) + " " +
                        "srcGeoCity=" + RandomUtil.getRandomString(15) + " " +
                        "srcGeoRegionCode=" + RandomUtil.getRandomString(15) + " " +
                        "srcGeoRegion=" + RandomUtil.getRandomString(15) + " " +
                        "srcGeoCountryCode=" + RandomUtil.getRandomString(15) + " " +
                        "srcGeoCountry=" + RandomUtil.getRandomString(15) + " " +
                        "fileName=" + RandomUtil.getRandomString(15) + " " +
                        "mapperIdentifier=" + RandomUtil.getRandomString(15) + " " +
                        "deviceVersion=" + RandomUtil.getRandomString(15) + " " +
                        "deviceModel=" + RandomUtil.getRandomString(15) + " " +
                        "deviceVendor=" + RandomUtil.getRandomString(15) + " " +
                        "deviceHostname=" + RandomUtil.getRandomString(15) + " " +
                        "deviceAddress=" + IpUtil.getRandomIp() + " " +
                        "deviceName=" + RandomUtil.getRandomString(15) + " " +
                        "catAttackThroughout=" + RandomUtil.getRandomString(15) + " " +
                        "createtime=" + TimeUtil.getRandomTime() + " " +
                        "catAttackSpeed=" + RandomUtil.getRandomString(15) + " " +
                        "catOutcome=" + RandomUtil.getRandomString(15) + " " +
                        "catSignificance=" + RandomUtil.getRandomString(15) + " " +
                        "catAttackFashion=" + RandomUtil.getRandomString(15) + " " +
                        "catTechnique=" + RandomUtil.getRandomString(15) + " " +
                        "catBehavior=" + RandomUtil.getRandomString(15) + " " +
                        "catObject=" + RandomUtil.getRandomString(15) + " " +
                        "catAttackSubtype=" + RandomUtil.getRandomString(15) + " " +
                        "catAttackType=" + RandomUtil.getRandomString(15) + " " +
                        "clientOperatingSystem=" + RandomUtil.getRandomString(15) + " " +
                        "responseCode=" + RandomUtil.getRandomString(15) + " " +
                        "requestUrl=" + RandomUtil.getRandomString(15) + " " +
                        "requestMethod=" + RandomUtil.getRandomString(15) + " " +
                        "requestCookies=" + RandomUtil.getRandomString(15) + " " +
                        "requestContext=" + RandomUtil.getRandomString(15) + " " +
                        "dvcSeverity=" + (RandomUtil.getRandomId()) + " " +
                        "dvcInInterface=" + RandomUtil.getRandomString(15) + " " +
                        "dvcOutInterface=" + RandomUtil.getRandomString(15) + " " +
                        "requestClientApplication=" + RandomUtil.getRandomString(15) + " " +
                        "dvcPayload=" + RandomUtil.getRandomString(15) + " " +
                        "dvcEventClassId=" + RandomUtil.getRandomId() + " " +
                        "dvcEventCategory=" + RandomUtil.getRandomString(15) + " " +
                        "dvcDirection=" + RandomUtil.getRandomString(15) + " " +
                        "dvcAction=" + RandomUtil.getRandomString(15) + " " +
                        "destZone=" + RandomUtil.getRandomString(15) + " " +
                        "destUserPrivileges=" + RandomUtil.getRandomString(15) + " " +
                        "destUserName=" + RandomUtil.getRandomString(15) + " " +
                        "dvcDomain=" + RandomUtil.getRandomString(15) + " " +
                        "destTransPort=" + PortUtil.getPort() + " " +
                        "destTransZone=" + RandomUtil.getRandomString(15) + " " +
                        "destUserId=" + RandomUtil.getRandomId() + " " +
                        "destTransAddress=" + IpUtil.getRandomIp() + " " +
                        "destGeoId=" + RandomUtil.getRandomId() + " " +
                        "destDnsDomain=" + RandomUtil.getRandomString(15) + " " +
                        "destAssetId=" + RandomUtil.getRandomId() + " " +
                        "destAddress=" + IpUtil.getRandomIp() + " " +
                        "srcZone=" + RandomUtil.getRandomString(15) + " " +
                        "srcUserPrivileges=" + RandomUtil.getRandomString(15) + " " +
                        "srcUserName=" + RandomUtil.getRandomString(15) + " " +
                        "srcUserId=" + RandomUtil.getRandomId() + " " +
                        "srcTransZone=" + RandomUtil.getRandomString(15) + " " +
                        "srcTransPort=" + PortUtil.getPort() + " " +
                        "srcTransAddress=" + IpUtil.getRandomIp() + " " +
                        "srcServiceName=" + RandomUtil.getRandomString(15) + " " +
                        "srcProcessName=" + RandomUtil.getRandomString(15) + " " +
                        "srcPort=" + PortUtil.getPort() + " " +
                        "srcNtDomain=" + RandomUtil.getRandomString(15) + " " +
                        "srcMacAddress=" + IpUtil.getRandomIp() + " " +
                        "srcHostName=" + RandomUtil.getRandomString(15) + " " +
                        "srcGeoId=" + RandomUtil.getRandomId() + " " +
                        "srcDnsDomain=" + RandomUtil.getRandomString(15) + " " +
                        "srcAssetId=" + RandomUtil.getRandomId() + " " +
                        "srcAddress=" + IpUtil.getRandomIp() + " " +
                        "endTime=" + TimeUtil.getRandomTime() + " " +
                        "startTime=" + TimeUtil.getRandomTime() + " " +
                        "socReceiptTime=" + TimeUtil.getRandomTime() + " " +
                        "collectorReceiptTime=" + TimeUtil.getRandomTime() + " " +
                        "deviceReceiptTime=" + TimeUtil.getRandomTime() + " " +
                        "bytesOut=" + RandomUtil.getRandomString(15) + " " +
                        "bytesIn=" + RandomUtil.getRandomString(15) + " " +
                        "transProtocol=" + RandomUtil.getRandomString(15) + " " +
                        "appProtocol=" + RandomUtil.getRandomString(15) + " " +
                        "externalId=" + RandomUtil.getRandomId() + " " +
                        "concentratorDevices=" + RandomUtil.getRandomString(15) + " " +
                        "concentratorAgents=" + RandomUtil.getRandomString(15) + " " +
                        "assetCriticality=" + RandomUtil.getRandomString(15) + " " +
                        "name=" + RandomUtil.getRandomString(15) + " " +
                        "message=" + RandomUtil.getRandomString(15) + " " +
                        "eventType=" + RandomUtil.getRandomString(15) + " " +
                        "eventId=" + RandomUtil.getRandomId() + " " +
                        "eventIdList=" + RandomUtil.getRandomString(15) + " " +
                        "sessionId=" + RandomUtil.getRandomId() + " " +
                        "ruleThreadId=" + RandomUtil.getRandomId() + " " +
                        "relevance=" + RandomUtil.getRandomString(15) + " " +
                        "priority=" + (RandomUtil.getRandomId()) + " " +
                        "persistence=" + RandomUtil.getRandomString(15) + " ";
                msg = " rawEvent= '" + msg + "'";
                syslog.log(0, msg);
            }
            else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        /*SyslogIF syslog = Syslog.getInstance("udp");
        syslog.getConfig().setHost("192.168.31.203");
        syslog.getConfig().setPort(514);
        while (true) {
            syslog.info(IpUtil.getRandomIp());
        }*/

    }
}
