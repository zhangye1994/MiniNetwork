package com.example.mininetwork.bean;

public class WeatherBean {

    /**
     * resultcode : 200
     * reason : successed!
     * result : {"sk":{"temp":"26","wind_direction":"北风","wind_strength":"1级","humidity":"87%","time":"23:41"},"today":{"temperature":"26℃~30℃","weather":"小雨转阵雨","weather_id":{"fa":"07","fb":"03"},"wind":"东南风3-5级","week":"星期二","city":"苏州","date_y":"2020年07月21日","dressing_index":"热","dressing_advice":"天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。","uv_index":"弱","comfort_index":"","wash_index":"不宜","travel_index":"较不宜","exercise_index":"较不宜","drying_index":""},"future":{"day_20200721":{"temperature":"26℃~30℃","weather":"小雨转阵雨","weather_id":{"fa":"07","fb":"03"},"wind":"东南风3-5级","week":"星期二","date":"20200721"},"day_20200722":{"temperature":"27℃~35℃","weather":"雷阵雨","weather_id":{"fa":"04","fb":"04"},"wind":"南风3-5级","week":"星期三","date":"20200722"},"day_20200723":{"temperature":"24℃~35℃","weather":"多云转雷阵雨","weather_id":{"fa":"01","fb":"04"},"wind":"西北风4-5级","week":"星期四","date":"20200723"},"day_20200724":{"temperature":"24℃~29℃","weather":"阵雨转多云","weather_id":{"fa":"03","fb":"01"},"wind":"西北风3-5级","week":"星期五","date":"20200724"},"day_20200725":{"temperature":"24℃~32℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"东风3-5级","week":"星期六","date":"20200725"},"day_20200726":{"temperature":"24℃~29℃","weather":"阵雨转多云","weather_id":{"fa":"03","fb":"01"},"wind":"西北风3-5级","week":"星期日","date":"20200726"},"day_20200727":{"temperature":"24℃~29℃","weather":"阵雨转多云","weather_id":{"fa":"03","fb":"01"},"wind":"西北风3-5级","week":"星期一","date":"20200727"}}}
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private ResultBean result;
    private int error_code;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * sk : {"temp":"26","wind_direction":"北风","wind_strength":"1级","humidity":"87%","time":"23:41"}
         * today : {"temperature":"26℃~30℃","weather":"小雨转阵雨","weather_id":{"fa":"07","fb":"03"},"wind":"东南风3-5级","week":"星期二","city":"苏州","date_y":"2020年07月21日","dressing_index":"热","dressing_advice":"天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。","uv_index":"弱","comfort_index":"","wash_index":"不宜","travel_index":"较不宜","exercise_index":"较不宜","drying_index":""}
         * future : {"day_20200721":{"temperature":"26℃~30℃","weather":"小雨转阵雨","weather_id":{"fa":"07","fb":"03"},"wind":"东南风3-5级","week":"星期二","date":"20200721"},"day_20200722":{"temperature":"27℃~35℃","weather":"雷阵雨","weather_id":{"fa":"04","fb":"04"},"wind":"南风3-5级","week":"星期三","date":"20200722"},"day_20200723":{"temperature":"24℃~35℃","weather":"多云转雷阵雨","weather_id":{"fa":"01","fb":"04"},"wind":"西北风4-5级","week":"星期四","date":"20200723"},"day_20200724":{"temperature":"24℃~29℃","weather":"阵雨转多云","weather_id":{"fa":"03","fb":"01"},"wind":"西北风3-5级","week":"星期五","date":"20200724"},"day_20200725":{"temperature":"24℃~32℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"东风3-5级","week":"星期六","date":"20200725"},"day_20200726":{"temperature":"24℃~29℃","weather":"阵雨转多云","weather_id":{"fa":"03","fb":"01"},"wind":"西北风3-5级","week":"星期日","date":"20200726"},"day_20200727":{"temperature":"24℃~29℃","weather":"阵雨转多云","weather_id":{"fa":"03","fb":"01"},"wind":"西北风3-5级","week":"星期一","date":"20200727"}}
         */

        private SkBean sk;
        private TodayBean today;
        private FutureBean future;

        public SkBean getSk() {
            return sk;
        }

        public void setSk(SkBean sk) {
            this.sk = sk;
        }

        public TodayBean getToday() {
            return today;
        }

        public void setToday(TodayBean today) {
            this.today = today;
        }

        public FutureBean getFuture() {
            return future;
        }

        public void setFuture(FutureBean future) {
            this.future = future;
        }

        public static class SkBean {
            /**
             * temp : 26
             * wind_direction : 北风
             * wind_strength : 1级
             * humidity : 87%
             * time : 23:41
             */

            private String temp;
            private String wind_direction;
            private String wind_strength;
            private String humidity;
            private String time;

            public String getTemp() {
                return temp;
            }

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_strength() {
                return wind_strength;
            }

            public void setWind_strength(String wind_strength) {
                this.wind_strength = wind_strength;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class TodayBean {
            /**
             * temperature : 26℃~30℃
             * weather : 小雨转阵雨
             * weather_id : {"fa":"07","fb":"03"}
             * wind : 东南风3-5级
             * week : 星期二
             * city : 苏州
             * date_y : 2020年07月21日
             * dressing_index : 热
             * dressing_advice : 天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。
             * uv_index : 弱
             * comfort_index :
             * wash_index : 不宜
             * travel_index : 较不宜
             * exercise_index : 较不宜
             * drying_index :
             */

            private String temperature;
            private String weather;
            private WeatherIdBean weather_id;
            private String wind;
            private String week;
            private String city;
            private String date_y;
            private String dressing_index;
            private String dressing_advice;
            private String uv_index;
            private String comfort_index;
            private String wash_index;
            private String travel_index;
            private String exercise_index;
            private String drying_index;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBean getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBean weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getDate_y() {
                return date_y;
            }

            public void setDate_y(String date_y) {
                this.date_y = date_y;
            }

            public String getDressing_index() {
                return dressing_index;
            }

            public void setDressing_index(String dressing_index) {
                this.dressing_index = dressing_index;
            }

            public String getDressing_advice() {
                return dressing_advice;
            }

            public void setDressing_advice(String dressing_advice) {
                this.dressing_advice = dressing_advice;
            }

            public String getUv_index() {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getComfort_index() {
                return comfort_index;
            }

            public void setComfort_index(String comfort_index) {
                this.comfort_index = comfort_index;
            }

            public String getWash_index() {
                return wash_index;
            }

            public void setWash_index(String wash_index) {
                this.wash_index = wash_index;
            }

            public String getTravel_index() {
                return travel_index;
            }

            public void setTravel_index(String travel_index) {
                this.travel_index = travel_index;
            }

            public String getExercise_index() {
                return exercise_index;
            }

            public void setExercise_index(String exercise_index) {
                this.exercise_index = exercise_index;
            }

            public String getDrying_index() {
                return drying_index;
            }

            public void setDrying_index(String drying_index) {
                this.drying_index = drying_index;
            }

            public static class WeatherIdBean {
                /**
                 * fa : 07
                 * fb : 03
                 */

                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }

        public static class FutureBean {
            /**
             * day_20200721 : {"temperature":"26℃~30℃","weather":"小雨转阵雨","weather_id":{"fa":"07","fb":"03"},"wind":"东南风3-5级","week":"星期二","date":"20200721"}
             * day_20200722 : {"temperature":"27℃~35℃","weather":"雷阵雨","weather_id":{"fa":"04","fb":"04"},"wind":"南风3-5级","week":"星期三","date":"20200722"}
             * day_20200723 : {"temperature":"24℃~35℃","weather":"多云转雷阵雨","weather_id":{"fa":"01","fb":"04"},"wind":"西北风4-5级","week":"星期四","date":"20200723"}
             * day_20200724 : {"temperature":"24℃~29℃","weather":"阵雨转多云","weather_id":{"fa":"03","fb":"01"},"wind":"西北风3-5级","week":"星期五","date":"20200724"}
             * day_20200725 : {"temperature":"24℃~32℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"东风3-5级","week":"星期六","date":"20200725"}
             * day_20200726 : {"temperature":"24℃~29℃","weather":"阵雨转多云","weather_id":{"fa":"03","fb":"01"},"wind":"西北风3-5级","week":"星期日","date":"20200726"}
             * day_20200727 : {"temperature":"24℃~29℃","weather":"阵雨转多云","weather_id":{"fa":"03","fb":"01"},"wind":"西北风3-5级","week":"星期一","date":"20200727"}
             */

            private Day20200721Bean day_20200721;
            private Day20200722Bean day_20200722;
            private Day20200723Bean day_20200723;
            private Day20200724Bean day_20200724;
            private Day20200725Bean day_20200725;
            private Day20200726Bean day_20200726;
            private Day20200727Bean day_20200727;

            public Day20200721Bean getDay_20200721() {
                return day_20200721;
            }

            public void setDay_20200721(Day20200721Bean day_20200721) {
                this.day_20200721 = day_20200721;
            }

            public Day20200722Bean getDay_20200722() {
                return day_20200722;
            }

            public void setDay_20200722(Day20200722Bean day_20200722) {
                this.day_20200722 = day_20200722;
            }

            public Day20200723Bean getDay_20200723() {
                return day_20200723;
            }

            public void setDay_20200723(Day20200723Bean day_20200723) {
                this.day_20200723 = day_20200723;
            }

            public Day20200724Bean getDay_20200724() {
                return day_20200724;
            }

            public void setDay_20200724(Day20200724Bean day_20200724) {
                this.day_20200724 = day_20200724;
            }

            public Day20200725Bean getDay_20200725() {
                return day_20200725;
            }

            public void setDay_20200725(Day20200725Bean day_20200725) {
                this.day_20200725 = day_20200725;
            }

            public Day20200726Bean getDay_20200726() {
                return day_20200726;
            }

            public void setDay_20200726(Day20200726Bean day_20200726) {
                this.day_20200726 = day_20200726;
            }

            public Day20200727Bean getDay_20200727() {
                return day_20200727;
            }

            public void setDay_20200727(Day20200727Bean day_20200727) {
                this.day_20200727 = day_20200727;
            }

            public static class Day20200721Bean {
                /**
                 * temperature : 26℃~30℃
                 * weather : 小雨转阵雨
                 * weather_id : {"fa":"07","fb":"03"}
                 * wind : 东南风3-5级
                 * week : 星期二
                 * date : 20200721
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanX {
                    /**
                     * fa : 07
                     * fb : 03
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20200722Bean {
                /**
                 * temperature : 27℃~35℃
                 * weather : 雷阵雨
                 * weather_id : {"fa":"04","fb":"04"}
                 * wind : 南风3-5级
                 * week : 星期三
                 * date : 20200722
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXX {
                    /**
                     * fa : 04
                     * fb : 04
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20200723Bean {
                /**
                 * temperature : 24℃~35℃
                 * weather : 多云转雷阵雨
                 * weather_id : {"fa":"01","fb":"04"}
                 * wind : 西北风4-5级
                 * week : 星期四
                 * date : 20200723
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXX {
                    /**
                     * fa : 01
                     * fb : 04
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20200724Bean {
                /**
                 * temperature : 24℃~29℃
                 * weather : 阵雨转多云
                 * weather_id : {"fa":"03","fb":"01"}
                 * wind : 西北风3-5级
                 * week : 星期五
                 * date : 20200724
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXX {
                    /**
                     * fa : 03
                     * fb : 01
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20200725Bean {
                /**
                 * temperature : 24℃~32℃
                 * weather : 多云转阴
                 * weather_id : {"fa":"01","fb":"02"}
                 * wind : 东风3-5级
                 * week : 星期六
                 * date : 20200725
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXX {
                    /**
                     * fa : 01
                     * fb : 02
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20200726Bean {
                /**
                 * temperature : 24℃~29℃
                 * weather : 阵雨转多云
                 * weather_id : {"fa":"03","fb":"01"}
                 * wind : 西北风3-5级
                 * week : 星期日
                 * date : 20200726
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXXX {
                    /**
                     * fa : 03
                     * fb : 01
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20200727Bean {
                /**
                 * temperature : 24℃~29℃
                 * weather : 阵雨转多云
                 * weather_id : {"fa":"03","fb":"01"}
                 * wind : 西北风3-5级
                 * week : 星期一
                 * date : 20200727
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXXXX {
                    /**
                     * fa : 03
                     * fb : 01
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }
        }
    }
}
