package com.legenda.lee.utilcollection.dto;

import java.util.List;

/**
 * @author Legenda-Lee
 * @date 2019-11-19 17:00
 * @description Gps经纬度解析物理地址对应的实体类
 * @since 1.0.0
 */
public class GpsAnalysisAddressDTO {
    /*
     * Gps经纬度解析后的返回实例
     {
        "status": "1",
        "regeocode": {
            "addressComponent": {
                "city": "杭州市",
                "province": "浙江省",
                "adcode": "330104",
                "district": "江干区",
                "towncode": "330104008000",
                "streetNumber": {
                    "number": "1504号",
                    "location": "120.219458,30.2592161",
                    "direction": "东",
                    "distance": "8.55227",
                    "street": "钱江路"
                },
                "country": "中国",
                "township": "四季青街道",
                "businessAreas": [
                    {
                        "location": "120.206996,30.257641",
                        "name": "四季青",
                        "id": "330104"
                    },
                    {
                        "location": "120.213988,30.250397",
                        "name": "钱江新城",
                        "id": "330104"
                    },
                    {
                        "location": "120.220679,30.26661",
                        "name": "三堡",
                        "id": "330104"
                    }
                ],
                "building": {
                    "name": [

                    ],
                    "type": [

                    ]
                },
                "neighborhood": {
                    "name": "金基晓庐",
                    "type": "商务住宅;住宅区;住宅小区"
                },
                "citycode": "0571"
            },
            "formatted_address": "浙江省杭州市江干区四季青街道金基晓庐"
        },
        "info": "OK",
        "infocode": "10000"
    }
     */

    /**
     * status : 1
     * regeocode : {"addressComponent":{"city":"杭州市","province":"浙江省","adcode":"330104","district":"江干区","towncode":"330104008000","streetNumber":{"number":"1504号","location":"120.219458,30.2592161","direction":"东","distance":"8.55227","street":"钱江路"},"country":"中国","township":"四季青街道","businessAreas":[{"location":"120.206996,30.257641","name":"四季青","id":"330104"},{"location":"120.213988,30.250397","name":"钱江新城","id":"330104"},{"location":"120.220679,30.26661","name":"三堡","id":"330104"}],"building":{"name":[],"type":[]},"neighborhood":{"name":"金基晓庐","type":"商务住宅;住宅区;住宅小区"},"citycode":"0571"},"formatted_address":"浙江省杭州市江干区四季青街道金基晓庐"}
     * info : OK
     * infocode : 10000
     */

    private String status;
    private RegeocodeBean regeocode;
    private String info;
    private String infocode;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RegeocodeBean getRegeocode() {
        return regeocode;
    }

    public void setRegeocode(RegeocodeBean regeocode) {
        this.regeocode = regeocode;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfocode() {
        return infocode;
    }

    public void setInfocode(String infocode) {
        this.infocode = infocode;
    }

    public static class RegeocodeBean {
        /**
         * addressComponent : {"city":"杭州市","province":"浙江省","adcode":"330104","district":"江干区","towncode":"330104008000","streetNumber":{"number":"1504号","location":"120.219458,30.2592161","direction":"东","distance":"8.55227","street":"钱江路"},"country":"中国","township":"四季青街道","businessAreas":[{"location":"120.206996,30.257641","name":"四季青","id":"330104"},{"location":"120.213988,30.250397","name":"钱江新城","id":"330104"},{"location":"120.220679,30.26661","name":"三堡","id":"330104"}],"building":{"name":[],"type":[]},"neighborhood":{"name":"金基晓庐","type":"商务住宅;住宅区;住宅小区"},"citycode":"0571"}
         * formatted_address : 浙江省杭州市江干区四季青街道金基晓庐
         */

        private AddressComponentBean addressComponent;
        private String formatted_address;

        public AddressComponentBean getAddressComponent() {
            return addressComponent;
        }

        public void setAddressComponent(AddressComponentBean addressComponent) {
            this.addressComponent = addressComponent;
        }

        public String getFormatted_address() {
            return formatted_address;
        }

        public void setFormatted_address(String formatted_address) {
            this.formatted_address = formatted_address;
        }

        public static class AddressComponentBean {
            /**
             * city : 杭州市
             * province : 浙江省
             * adcode : 330104
             * district : 江干区
             * towncode : 330104008000
             * streetNumber : {"number":"1504号","location":"120.219458,30.2592161","direction":"东","distance":"8.55227","street":"钱江路"}
             * country : 中国
             * township : 四季青街道
             * businessAreas : [{"location":"120.206996,30.257641","name":"四季青","id":"330104"},{"location":"120.213988,30.250397","name":"钱江新城","id":"330104"},{"location":"120.220679,30.26661","name":"三堡","id":"330104"}]
             * building : {"name":[],"type":[]}
             * neighborhood : {"name":"金基晓庐","type":"商务住宅;住宅区;住宅小区"}
             * citycode : 0571
             */

            private String city;
            private String province;
            private String adcode;
            private String district;
            private String towncode;
            private StreetNumberBean streetNumber;
            private String country;
            private String township;
            private BuildingBean building;
            private NeighborhoodBean neighborhood;
            private String citycode;
            private List<BusinessAreasBean> businessAreas;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getAdcode() {
                return adcode;
            }

            public void setAdcode(String adcode) {
                this.adcode = adcode;
            }

            public String getDistrict() {
                return district;
            }

            public void setDistrict(String district) {
                this.district = district;
            }

            public String getTowncode() {
                return towncode;
            }

            public void setTowncode(String towncode) {
                this.towncode = towncode;
            }

            public StreetNumberBean getStreetNumber() {
                return streetNumber;
            }

            public void setStreetNumber(StreetNumberBean streetNumber) {
                this.streetNumber = streetNumber;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getTownship() {
                return township;
            }

            public void setTownship(String township) {
                this.township = township;
            }

            public BuildingBean getBuilding() {
                return building;
            }

            public void setBuilding(BuildingBean building) {
                this.building = building;
            }

            public NeighborhoodBean getNeighborhood() {
                return neighborhood;
            }

            public void setNeighborhood(NeighborhoodBean neighborhood) {
                this.neighborhood = neighborhood;
            }

            public String getCitycode() {
                return citycode;
            }

            public void setCitycode(String citycode) {
                this.citycode = citycode;
            }

            public List<BusinessAreasBean> getBusinessAreas() {
                return businessAreas;
            }

            public void setBusinessAreas(List<BusinessAreasBean> businessAreas) {
                this.businessAreas = businessAreas;
            }

            public static class StreetNumberBean {
                /**
                 * number : 1504号
                 * location : 120.219458,30.2592161
                 * direction : 东
                 * distance : 8.55227
                 * street : 钱江路
                 */

                private String number;
                private String location;
                private String direction;
                private String distance;
                private String street;

                public String getNumber() {
                    return number;
                }

                public void setNumber(String number) {
                    this.number = number;
                }

                public String getLocation() {
                    return location;
                }

                public void setLocation(String location) {
                    this.location = location;
                }

                public String getDirection() {
                    return direction;
                }

                public void setDirection(String direction) {
                    this.direction = direction;
                }

                public String getDistance() {
                    return distance;
                }

                public void setDistance(String distance) {
                    this.distance = distance;
                }

                public String getStreet() {
                    return street;
                }

                public void setStreet(String street) {
                    this.street = street;
                }
            }

            public static class BuildingBean {
                private List<?> name;
                private List<?> type;

                public List<?> getName() {
                    return name;
                }

                public void setName(List<?> name) {
                    this.name = name;
                }

                public List<?> getType() {
                    return type;
                }

                public void setType(List<?> type) {
                    this.type = type;
                }
            }

            public static class NeighborhoodBean {
                /**
                 * name : 金基晓庐
                 * type : 商务住宅;住宅区;住宅小区
                 */

                private String name;
                private String type;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }

            public static class BusinessAreasBean {
                /**
                 * location : 120.206996,30.257641
                 * name : 四季青
                 * id : 330104
                 */

                private String location;
                private String name;
                private String id;

                public String getLocation() {
                    return location;
                }

                public void setLocation(String location) {
                    this.location = location;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }
            }
        }
    }
}


