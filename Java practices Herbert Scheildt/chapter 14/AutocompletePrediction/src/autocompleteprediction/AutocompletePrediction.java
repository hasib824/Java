/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autocompleteprediction;

/**
 *
 * @author Hasibuzzaman
 */
public class AutocompletePrediction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    {
	"response": {
		"version": "0.1",
		"termsofService": "http://www.wunderground.com/weather/api/d/terms.html",
		"features": {
			"geolookup": 1,
			"conditions": 1,
			"forecast10day": 1
		}
	},
	"location": {
		"type": "INTLCITY",
		"country": "BW",
		"country_iso3166": "BD",
		"country_name": "Bangladesh",
		"state": "",
		"city": "Dhaka",
		"tz_short": "BDT",
		"tz_long": "Asia/Dhaka",
		"lat": "23.77000046",
		"lon": "90.37999725",
		"zip": "00000",
		"magic": "1",
		"wmo": "41923",
		"l": "/q/zmw:00000.1.41923",
		"requesturl": "global/stations/41923.html",
		"wuiurl": "https://www.wunderground.com/global/stations/41923.html",
		"nearby_weather_stations": {
			"airport": {
				"station": [
					{
						"city": "Dhaka",
						"state": "",
						"country": "Bangladesh",
						"icao": "VGTJ",
						"lat": "23.77878380",
						"lon": "90.38269043"
					}
				]
			},
			"pws": {
				"station": [
					{
						"neighborhood": "Lalmatia",
						"city": "Dhaka",
						"state": "",
						"country": "BD",
						"id": "IDHAKA12",
						"lat": 23.756517,
						"lon": 90.371086,
						"distance_km": 1,
						"distance_mi": 1
					},
					{
						"neighborhood": "Lalmatia",
						"city": "Dhaka",
						"state": "",
						"country": "BD",
						"id": "IDHAKA14",
						"lat": 23.756645,
						"lon": 90.37072,
						"distance_km": 1,
						"distance_mi": 1
					},
					{
						"neighborhood": "Power Station",
						"city": "Ghorashal",
						"state": "DHAKA DIVISION",
						"country": "BD",
						"id": "IDHAKADI2",
						"lat": 23.981564,
						"lon": 90.641014,
						"distance_km": 35,
						"distance_mi": 21
					}
				]
			}
		}
	},  // Location class End
	"current_observation": {
		"image": {
			"url": "http://icons.wxug.com/graphics/wu2/logo_130x80.png",
			"title": "Weather Underground",
			"link": "http://www.wunderground.com"
		},
		"display_location": {
			"full": "Dhaka, Bangladesh",
			"city": "Dhaka",
			"state": "",
			"state_name": "Bangladesh",
			"country": "BW",
			"country_iso3166": "BD",
			"zip": "00000",
			"magic": "1",
			"wmo": "41923",
			"latitude": "23.77000046",
			"longitude": "90.37999725",
			"elevation": "8.00000000"
		},
		"observation_location": {
			"full": "Dhaka, ",
			"city": "Dhaka",
			"state": "",
			"country": "Bangladesh",
			"country_iso3166": "BD",
			"latitude": "23.77878380",
			"longitude": "90.38269043",
			"elevation": "30 ft"
		},
		"estimated": {},
		"station_id": "41923",
		"observation_time": "Last Updated on August 22, 12:00 AM BDT",
		"observation_time_rfc822": "Mon, 22 Aug 2016 00:00:00 +0600",
		"observation_epoch": "1471802400",
		"local_time_rfc822": "Mon, 22 Aug 2016 03:00:37 +0600",
		"local_epoch": "1471813237",
		"local_tz_short": "BDT",
		"local_tz_long": "Asia/Dhaka",
		"local_tz_offset": "+0600",
		"weather": "Partly Cloudy",
		"temperature_string": "77 F (25 C)",
		"temp_f": 77,
		"temp_c": 25,
		"relative_humidity": "73%",
		"wind_string": "From the South at 2 MPH",
		"wind_dir": "South",
		"wind_degrees": 180,
		"wind_mph": 2,
		"wind_gust_mph": 0,
		"wind_kph": 4,
		"wind_gust_kph": 0,
		"pressure_mb": "1004",
		"pressure_in": "29.64",
		"pressure_trend": "",
		"dewpoint_string": "70 F (21 C)",
		"dewpoint_f": 70,
		"dewpoint_c": 21,
		"heat_index_string": "NA",
		"heat_index_f": "NA",
		"heat_index_c": "NA",
		"windchill_string": "NA",
		"windchill_f": "NA",
		"windchill_c": "NA",
		"feelslike_string": "77 F (25 C)",
		"feelslike_f": "77",
		"feelslike_c": "25",
		"visibility_mi": "2.0",
		"visibility_km": "4.0",
		"solarradiation": "--",
		"UV": "-1",
		"precip_1hr_string": " in ( mm)",
		"precip_1hr_in": "",
		"precip_1hr_metric": "--",
		"precip_today_string": " in ( mm)",
		"precip_today_in": "",
		"precip_today_metric": "--",
		"icon": "partlycloudy",
		"icon_url": "http://icons.wxug.com/i/c/k/nt_partlycloudy.gif",
		"forecast_url": "http://www.wunderground.com/global/stations/41923.html",
		"history_url": "http://www.wunderground.com/history/airport/41923/2016/8/22/DailyHistory.html",
		"ob_url": "http://www.wunderground.com/cgi-bin/findweather/getForecast?query=23.77878380,90.38269043",
		"nowcast": ""
	}, // End Of Current Obserbation
                
                
	"forecast": {
		"txt_forecast": {
			"date": "1:55 AM BDT",
			"forecastday": [
				{
					"period": 0,
					"icon": "partlycloudy",
					"icon_url": "http://icons.wxug.com/i/c/k/partlycloudy.gif",
					"title": "Monday",
					"fcttext": "Intervals of clouds and sunshine. High 89F. Winds SSE at 10 to 15 mph.",
					"fcttext_metric": "Intervals of clouds and sunshine. High 32C. Winds SSE at 15 to 25 km/h.",
					"pop": "20"
				},
				{
					"period": 1,
					"icon": "nt_clear",
					"icon_url": "http://icons.wxug.com/i/c/k/nt_clear.gif",
					"title": "Monday Night",
					"fcttext": "Mainly clear skies. Low 78F. Winds light and variable.",
					"fcttext_metric": "Mostly clear skies. Low around 25C. Winds light and variable.",
					"pop": "10"
				},
				{
					"period": 2,
					"icon": "partlycloudy",
					"icon_url": "http://icons.wxug.com/i/c/k/partlycloudy.gif",
					"title": "Tuesday",
					"fcttext": "Intervals of clouds and sunshine. High 92F. Winds light and variable.",
					"fcttext_metric": "Intervals of clouds and sunshine. High 33C. Winds light and variable.",
					"pop": "20"
				},
				{
					"period": 3,
					"icon": "nt_tstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/nt_tstorms.gif",
					"title": "Tuesday Night",
					"fcttext": "Partly cloudy skies early. Scattered thunderstorms developing later at night. Low around 80F. Winds light and variable. Chance of rain 40%.",
					"fcttext_metric": "Partly cloudy with late night showers or thunderstorms. Low 27C. Winds light and variable. Chance of rain 40%.",
					"pop": "40"
				},
				{
					"period": 4,
					"icon": "chancetstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/chancetstorms.gif",
					"title": "Wednesday",
					"fcttext": "Partly to mostly cloudy skies with scattered thunderstorms in the morning. High 91F. Winds light and variable. Chance of rain 50%.",
					"fcttext_metric": "Scattered thunderstorms in the morning. Partly cloudy skies late. High 33C. Winds light and variable. Chance of rain 50%.",
					"pop": "50"
				},
				{
					"period": 5,
					"icon": "nt_tstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/nt_tstorms.gif",
					"title": "Wednesday Night",
					"fcttext": "Partly cloudy during the evening with thunderstorms becoming likely overnight. Low 81F. Winds light and variable. Chance of rain 80%.",
					"fcttext_metric": "Partly cloudy in the evening. Thunderstorms developing after midnight. Low 27C. Winds light and variable. Chance of rain 80%.",
					"pop": "80"
				},
				{
					"period": 6,
					"icon": "tstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/tstorms.gif",
					"title": "Thursday",
					"fcttext": "Thunderstorms likely in the morning. Then the chance of scattered thunderstorms in the afternoon. High 92F. Winds light and variable. Chance of rain 80%.",
					"fcttext_metric": "Thunderstorms likely in the morning. Then the chance of scattered thunderstorms in the afternoon. High 33C. Winds light and variable. Chance of rain 80%.",
					"pop": "80"
				},
				{
					"period": 7,
					"icon": "nt_tstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/nt_tstorms.gif",
					"title": "Thursday Night",
					"fcttext": "Partial cloudiness early, with scattered showers and thunderstorms later during the night. Low around 80F. Winds light and variable. Chance of rain 60%.",
					"fcttext_metric": "Partly cloudy with late night showers or thunderstorms. Low 27C. Winds light and variable. Chance of rain 60%.",
					"pop": "60"
				},
				{
					"period": 8,
					"icon": "chancetstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/chancetstorms.gif",
					"title": "Friday",
					"fcttext": "Scattered thunderstorms in the morning. Partly cloudy skies late. High 93F. Winds light and variable. Chance of rain 50%.",
					"fcttext_metric": "Scattered thunderstorms in the morning. Partly cloudy skies late. High 34C. Winds light and variable. Chance of rain 50%.",
					"pop": "50"
				},
				{
					"period": 9,
					"icon": "nt_chancetstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/nt_chancetstorms.gif",
					"title": "Friday Night",
					"fcttext": "Variable clouds with thunderstorms, especially overnight. Low around 80F. Winds light and variable. Chance of rain 60%.",
					"fcttext_metric": "Variable clouds with thunderstorms, especially overnight. Low 27C. Winds light and variable. Chance of rain 60%.",
					"pop": "60"
				},
				{
					"period": 10,
					"icon": "chancetstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/chancetstorms.gif",
					"title": "Saturday",
					"fcttext": "Scattered thunderstorms in the morning, then partly cloudy late. High 91F. Winds light and variable. Chance of rain 50%.",
					"fcttext_metric": "Scattered thunderstorms in the morning, then partly cloudy late. High 33C. Winds light and variable. Chance of rain 50%.",
					"pop": "50"
				},
				{
					"period": 11,
					"icon": "nt_tstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/nt_tstorms.gif",
					"title": "Saturday Night",
					"fcttext": "Partly cloudy skies early. Scattered thunderstorms developing later at night. Low near 80F. Winds light and variable. Chance of rain 50%.",
					"fcttext_metric": "Partly cloudy in the evening followed by scattered thunderstorms after midnight. Low 26C. Winds light and variable. Chance of rain 50%.",
					"pop": "50"
				},
				{
					"period": 12,
					"icon": "chancetstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/chancetstorms.gif",
					"title": "Sunday",
					"fcttext": "Scattered thunderstorms, especially in the morning. High around 90F. Winds light and variable. Chance of rain 50%.",
					"fcttext_metric": "Partly to mostly cloudy skies with scattered thunderstorms in the morning. High 32C. Winds light and variable. Chance of rain 50%.",
					"pop": "50"
				},
				{
					"period": 13,
					"icon": "nt_partlycloudy",
					"icon_url": "http://icons.wxug.com/i/c/k/nt_partlycloudy.gif",
					"title": "Sunday Night",
					"fcttext": "Partly cloudy skies during the evening will give way to cloudy skies overnight. Low around 80F. Winds SSW at 5 to 10 mph.",
					"fcttext_metric": "Partly to mostly cloudy. Low 27C. Winds SSW at 10 to 15 km/h.",
					"pop": "20"
				},
				{
					"period": 14,
					"icon": "partlycloudy",
					"icon_url": "http://icons.wxug.com/i/c/k/partlycloudy.gif",
					"title": "Monday",
					"fcttext": "Intervals of clouds and sunshine. High around 90F. Winds SSW at 5 to 10 mph.",
					"fcttext_metric": "Partly cloudy skies. High 32C. Winds SSW at 10 to 15 km/h.",
					"pop": "10"
				},
				{
					"period": 15,
					"icon": "nt_partlycloudy",
					"icon_url": "http://icons.wxug.com/i/c/k/nt_partlycloudy.gif",
					"title": "Monday Night",
					"fcttext": "Partly cloudy skies. Low near 80F. Winds SSW at 5 to 10 mph.",
					"fcttext_metric": "Partly cloudy. Low 27C. Winds SSW at 10 to 15 km/h.",
					"pop": "20"
				},
				{
					"period": 16,
					"icon": "chancetstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/chancetstorms.gif",
					"title": "Tuesday",
					"fcttext": "Scattered thunderstorms in the morning, then partly cloudy late. High around 90F. Winds SSW at 5 to 10 mph. Chance of rain 40%.",
					"fcttext_metric": "Isolated thunderstorms in the morning, then skies turning partly cloudy late. High 32C. Winds SSW at 10 to 15 km/h. Chance of rain 30%.",
					"pop": "40"
				},
				{
					"period": 17,
					"icon": "nt_tstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/nt_tstorms.gif",
					"title": "Tuesday Night",
					"fcttext": "Partly cloudy in the evening. Thunderstorms developing after midnight. Low around 80F. Winds SSW at 5 to 10 mph. Chance of rain 80%.",
					"fcttext_metric": "Partly cloudy during the evening with thunderstorms becoming likely overnight. Low 27C. Winds SSW at 10 to 15 km/h. Chance of rain 80%.",
					"pop": "80"
				},
				{
					"period": 18,
					"icon": "tstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/tstorms.gif",
					"title": "Wednesday",
					"fcttext": "Thunderstorms. High near 90F. Winds SSW at 10 to 15 mph. Chance of rain 80%.",
					"fcttext_metric": "Thunderstorms. High 32C. Winds SSW at 10 to 15 km/h. Chance of rain 80%.",
					"pop": "80"
				},
				{
					"period": 19,
					"icon": "nt_tstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/nt_tstorms.gif",
					"title": "Wednesday Night",
					"fcttext": "Thunderstorms. Low around 80F. Winds SSW at 5 to 10 mph. Chance of rain 80%.",
					"fcttext_metric": "Thunderstorms likely. Low 26C. Winds SSW at 10 to 15 km/h. Chance of rain 80%.",
					"pop": "80"
				}
			]
		},
		"simpleforecast": {
			"forecastday": [
				{
					"date": {
						"epoch": "1471870800",
						"pretty": "7:00 PM BDT on August 22, 2016",
						"day": 22,
						"month": 8,
						"year": 2016,
						"yday": 234,
						"hour": 19,
						"min": "00",
						"sec": 0,
						"isdst": "0",
						"monthname": "August",
						"monthname_short": "Aug",
						"weekday_short": "Mon",
						"weekday": "Monday",
						"ampm": "PM",
						"tz_short": "BDT",
						"tz_long": "Asia/Dhaka"
					},
					"period": 1,
					"high": {
						"fahrenheit": "89",
						"celsius": "32"
					},
					"low": {
						"fahrenheit": "78",
						"celsius": "26"
					},
					"conditions": "Partly Cloudy",
					"icon": "partlycloudy",
					"icon_url": "http://icons.wxug.com/i/c/k/partlycloudy.gif",
					"skyicon": "",
					"pop": 20,
					"qpf_allday": {
						"in": 0,
						"mm": 0
					},
					"qpf_day": {
						"in": 0,
						"mm": 0
					},
					"qpf_night": {
						"in": 0,
						"mm": 0
					},
					"snow_allday": {
						"in": 0,
						"cm": 0
					},
					"snow_day": {
						"in": 0,
						"cm": 0
					},
					"snow_night": {
						"in": 0,
						"cm": 0
					},
					"maxwind": {
						"mph": 15,
						"kph": 24,
						"dir": "SSE",
						"degrees": 167
					},
					"avewind": {
						"mph": 12,
						"kph": 19,
						"dir": "SSE",
						"degrees": 167
					},
					"avehumidity": 73,
					"maxhumidity": 0,
					"minhumidity": 0
				},  // End Of 1st Day 
				{
					"date": {
						"epoch": "1471957200",
						"pretty": "7:00 PM BDT on August 23, 2016",
						"day": 23,
						"month": 8,
						"year": 2016,
						"yday": 235,
						"hour": 19,
						"min": "00",
						"sec": 0,
						"isdst": "0",
						"monthname": "August",
						"monthname_short": "Aug",
						"weekday_short": "Tue",
						"weekday": "Tuesday",
						"ampm": "PM",
						"tz_short": "BDT",
						"tz_long": "Asia/Dhaka"
					},
					"period": 2,
					"high": {
						"fahrenheit": "92",
						"celsius": "33"
					},
					"low": {
						"fahrenheit": "80",
						"celsius": "27"
					},
					"conditions": "Partly Cloudy",
					"icon": "partlycloudy",
					"icon_url": "http://icons.wxug.com/i/c/k/partlycloudy.gif",
					"skyicon": "",
					"pop": 20,
					"qpf_allday": {
						"in": 0.03,
						"mm": 1
					},
					"qpf_day": {
						"in": 0,
						"mm": 0
					},
					"qpf_night": {
						"in": 0.03,
						"mm": 1
					},
					"snow_allday": {
						"in": 0,
						"cm": 0
					},
					"snow_day": {
						"in": 0,
						"cm": 0
					},
					"snow_night": {
						"in": 0,
						"cm": 0
					},
					"maxwind": {
						"mph": 5,
						"kph": 8,
						"dir": "SW",
						"degrees": 222
					},
					"avewind": {
						"mph": 4,
						"kph": 6,
						"dir": "SW",
						"degrees": 222
					},
					"avehumidity": 66,
					"maxhumidity": 0,
					"minhumidity": 0
				},
				{
					"date": {
						"epoch": "1472043600",
						"pretty": "7:00 PM BDT on August 24, 2016",
						"day": 24,
						"month": 8,
						"year": 2016,
						"yday": 236,
						"hour": 19,
						"min": "00",
						"sec": 0,
						"isdst": "0",
						"monthname": "August",
						"monthname_short": "Aug",
						"weekday_short": "Wed",
						"weekday": "Wednesday",
						"ampm": "PM",
						"tz_short": "BDT",
						"tz_long": "Asia/Dhaka"
					},
					"period": 3,
					"high": {
						"fahrenheit": "91",
						"celsius": "33"
					},
					"low": {
						"fahrenheit": "81",
						"celsius": "27"
					},
					"conditions": "Chance of a Thunderstorm",
					"icon": "chancetstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/chancetstorms.gif",
					"skyicon": "",
					"pop": 50,
					"qpf_allday": {
						"in": 0.18,
						"mm": 5
					},
					"qpf_day": {
						"in": 0.1,
						"mm": 3
					},
					"qpf_night": {
						"in": 0.08,
						"mm": 2
					},
					"snow_allday": {
						"in": 0,
						"cm": 0
					},
					"snow_day": {
						"in": 0,
						"cm": 0
					},
					"snow_night": {
						"in": 0,
						"cm": 0
					},
					"maxwind": {
						"mph": 5,
						"kph": 8,
						"dir": "NNW",
						"degrees": 334
					},
					"avewind": {
						"mph": 4,
						"kph": 6,
						"dir": "NNW",
						"degrees": 334
					},
					"avehumidity": 71,
					"maxhumidity": 0,
					"minhumidity": 0
				},
				{
					"date": {
						"epoch": "1472130000",
						"pretty": "7:00 PM BDT on August 25, 2016",
						"day": 25,
						"month": 8,
						"year": 2016,
						"yday": 237,
						"hour": 19,
						"min": "00",
						"sec": 0,
						"isdst": "0",
						"monthname": "August",
						"monthname_short": "Aug",
						"weekday_short": "Thu",
						"weekday": "Thursday",
						"ampm": "PM",
						"tz_short": "BDT",
						"tz_long": "Asia/Dhaka"
					},
					"period": 4,
					"high": {
						"fahrenheit": "92",
						"celsius": "33"
					},
					"low": {
						"fahrenheit": "80",
						"celsius": "27"
					},
					"conditions": "Thunderstorm",
					"icon": "tstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/tstorms.gif",
					"skyicon": "",
					"pop": 80,
					"qpf_allday": {
						"in": 0.19,
						"mm": 5
					},
					"qpf_day": {
						"in": 0.15,
						"mm": 4
					},
					"qpf_night": {
						"in": 0.03,
						"mm": 1
					},
					"snow_allday": {
						"in": 0,
						"cm": 0
					},
					"snow_day": {
						"in": 0,
						"cm": 0
					},
					"snow_night": {
						"in": 0,
						"cm": 0
					},
					"maxwind": {
						"mph": 10,
						"kph": 16,
						"dir": "SW",
						"degrees": 215
					},
					"avewind": {
						"mph": 5,
						"kph": 8,
						"dir": "SW",
						"degrees": 215
					},
					"avehumidity": 72,
					"maxhumidity": 0,
					"minhumidity": 0
				},
				{
					"date": {
						"epoch": "1472216400",
						"pretty": "7:00 PM BDT on August 26, 2016",
						"day": 26,
						"month": 8,
						"year": 2016,
						"yday": 238,
						"hour": 19,
						"min": "00",
						"sec": 0,
						"isdst": "0",
						"monthname": "August",
						"monthname_short": "Aug",
						"weekday_short": "Fri",
						"weekday": "Friday",
						"ampm": "PM",
						"tz_short": "BDT",
						"tz_long": "Asia/Dhaka"
					},
					"period": 5,
					"high": {
						"fahrenheit": "93",
						"celsius": "34"
					},
					"low": {
						"fahrenheit": "80",
						"celsius": "27"
					},
					"conditions": "Chance of a Thunderstorm",
					"icon": "chancetstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/chancetstorms.gif",
					"skyicon": "",
					"pop": 50,
					"qpf_allday": {
						"in": 0.19,
						"mm": 5
					},
					"qpf_day": {
						"in": 0.04,
						"mm": 1
					},
					"qpf_night": {
						"in": 0.15,
						"mm": 4
					},
					"snow_allday": {
						"in": 0,
						"cm": 0
					},
					"snow_day": {
						"in": 0,
						"cm": 0
					},
					"snow_night": {
						"in": 0,
						"cm": 0
					},
					"maxwind": {
						"mph": 5,
						"kph": 8,
						"dir": "SSE",
						"degrees": 167
					},
					"avewind": {
						"mph": 4,
						"kph": 6,
						"dir": "SSE",
						"degrees": 167
					},
					"avehumidity": 71,
					"maxhumidity": 0,
					"minhumidity": 0
				},
				{
					"date": {
						"epoch": "1472302800",
						"pretty": "7:00 PM BDT on August 27, 2016",
						"day": 27,
						"month": 8,
						"year": 2016,
						"yday": 239,
						"hour": 19,
						"min": "00",
						"sec": 0,
						"isdst": "0",
						"monthname": "August",
						"monthname_short": "Aug",
						"weekday_short": "Sat",
						"weekday": "Saturday",
						"ampm": "PM",
						"tz_short": "BDT",
						"tz_long": "Asia/Dhaka"
					},
					"period": 6,
					"high": {
						"fahrenheit": "91",
						"celsius": "33"
					},
					"low": {
						"fahrenheit": "80",
						"celsius": "27"
					},
					"conditions": "Chance of a Thunderstorm",
					"icon": "chancetstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/chancetstorms.gif",
					"skyicon": "",
					"pop": 50,
					"qpf_allday": {
						"in": 0.14,
						"mm": 4
					},
					"qpf_day": {
						"in": 0.05,
						"mm": 1
					},
					"qpf_night": {
						"in": 0.08,
						"mm": 2
					},
					"snow_allday": {
						"in": 0,
						"cm": 0
					},
					"snow_day": {
						"in": 0,
						"cm": 0
					},
					"snow_night": {
						"in": 0,
						"cm": 0
					},
					"maxwind": {
						"mph": 10,
						"kph": 16,
						"dir": "SSE",
						"degrees": 166
					},
					"avewind": {
						"mph": 5,
						"kph": 8,
						"dir": "SSE",
						"degrees": 166
					},
					"avehumidity": 71,
					"maxhumidity": 0,
					"minhumidity": 0
				},
				{
					"date": {
						"epoch": "1472389200",
						"pretty": "7:00 PM BDT on August 28, 2016",
						"day": 28,
						"month": 8,
						"year": 2016,
						"yday": 240,
						"hour": 19,
						"min": "00",
						"sec": 0,
						"isdst": "0",
						"monthname": "August",
						"monthname_short": "Aug",
						"weekday_short": "Sun",
						"weekday": "Sunday",
						"ampm": "PM",
						"tz_short": "BDT",
						"tz_long": "Asia/Dhaka"
					},
					"period": 7,
					"high": {
						"fahrenheit": "90",
						"celsius": "32"
					},
					"low": {
						"fahrenheit": "80",
						"celsius": "27"
					},
					"conditions": "Chance of a Thunderstorm",
					"icon": "chancetstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/chancetstorms.gif",
					"skyicon": "",
					"pop": 50,
					"qpf_allday": {
						"in": 0.1,
						"mm": 3
					},
					"qpf_day": {
						"in": 0.09,
						"mm": 2
					},
					"qpf_night": {
						"in": 0,
						"mm": 0
					},
					"snow_allday": {
						"in": 0,
						"cm": 0
					},
					"snow_day": {
						"in": 0,
						"cm": 0
					},
					"snow_night": {
						"in": 0,
						"cm": 0
					},
					"maxwind": {
						"mph": 10,
						"kph": 16,
						"dir": "SSW",
						"degrees": 202
					},
					"avewind": {
						"mph": 5,
						"kph": 8,
						"dir": "SSW",
						"degrees": 202
					},
					"avehumidity": 72,
					"maxhumidity": 0,
					"minhumidity": 0
				},
				{
					"date": {
						"epoch": "1472475600",
						"pretty": "7:00 PM BDT on August 29, 2016",
						"day": 29,
						"month": 8,
						"year": 2016,
						"yday": 241,
						"hour": 19,
						"min": "00",
						"sec": 0,
						"isdst": "0",
						"monthname": "August",
						"monthname_short": "Aug",
						"weekday_short": "Mon",
						"weekday": "Monday",
						"ampm": "PM",
						"tz_short": "BDT",
						"tz_long": "Asia/Dhaka"
					},
					"period": 8,
					"high": {
						"fahrenheit": "90",
						"celsius": "32"
					},
					"low": {
						"fahrenheit": "80",
						"celsius": "27"
					},
					"conditions": "Partly Cloudy",
					"icon": "partlycloudy",
					"icon_url": "http://icons.wxug.com/i/c/k/partlycloudy.gif",
					"skyicon": "",
					"pop": 10,
					"qpf_allday": {
						"in": 0,
						"mm": 0
					},
					"qpf_day": {
						"in": 0,
						"mm": 0
					},
					"qpf_night": {
						"in": 0,
						"mm": 0
					},
					"snow_allday": {
						"in": 0,
						"cm": 0
					},
					"snow_day": {
						"in": 0,
						"cm": 0
					},
					"snow_night": {
						"in": 0,
						"cm": 0
					},
					"maxwind": {
						"mph": 10,
						"kph": 16,
						"dir": "SSW",
						"degrees": 210
					},
					"avewind": {
						"mph": 7,
						"kph": 11,
						"dir": "SSW",
						"degrees": 210
					},
					"avehumidity": 71,
					"maxhumidity": 0,
					"minhumidity": 0
				},
				{
					"date": {
						"epoch": "1472562000",
						"pretty": "7:00 PM BDT on August 30, 2016",
						"day": 30,
						"month": 8,
						"year": 2016,
						"yday": 242,
						"hour": 19,
						"min": "00",
						"sec": 0,
						"isdst": "0",
						"monthname": "August",
						"monthname_short": "Aug",
						"weekday_short": "Tue",
						"weekday": "Tuesday",
						"ampm": "PM",
						"tz_short": "BDT",
						"tz_long": "Asia/Dhaka"
					},
					"period": 9,
					"high": {
						"fahrenheit": "90",
						"celsius": "32"
					},
					"low": {
						"fahrenheit": "80",
						"celsius": "27"
					},
					"conditions": "Chance of a Thunderstorm",
					"icon": "chancetstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/chancetstorms.gif",
					"skyicon": "",
					"pop": 40,
					"qpf_allday": {
						"in": 0.1,
						"mm": 3
					},
					"qpf_day": {
						"in": 0.01,
						"mm": 0
					},
					"qpf_night": {
						"in": 0.09,
						"mm": 2
					},
					"snow_allday": {
						"in": 0,
						"cm": 0
					},
					"snow_day": {
						"in": 0,
						"cm": 0
					},
					"snow_night": {
						"in": 0,
						"cm": 0
					},
					"maxwind": {
						"mph": 10,
						"kph": 16,
						"dir": "SSW",
						"degrees": 204
					},
					"avewind": {
						"mph": 8,
						"kph": 13,
						"dir": "SSW",
						"degrees": 204
					},
					"avehumidity": 71,
					"maxhumidity": 0,
					"minhumidity": 0
				},
				{
					"date": {
						"epoch": "1472648400",
						"pretty": "7:00 PM BDT on August 31, 2016",
						"day": 31,
						"month": 8,
						"year": 2016,
						"yday": 243,
						"hour": 19,
						"min": "00",
						"sec": 0,
						"isdst": "0",
						"monthname": "August",
						"monthname_short": "Aug",
						"weekday_short": "Wed",
						"weekday": "Wednesday",
						"ampm": "PM",
						"tz_short": "BDT",
						"tz_long": "Asia/Dhaka"
					},
					"period": 10,
					"high": {
						"fahrenheit": "90",
						"celsius": "32"
					},
					"low": {
						"fahrenheit": "80",
						"celsius": "27"
					},
					"conditions": "Thunderstorm",
					"icon": "tstorms",
					"icon_url": "http://icons.wxug.com/i/c/k/tstorms.gif",
					"skyicon": "",
					"pop": 80,
					"qpf_allday": {
						"in": 0.72,
						"mm": 18
					},
					"qpf_day": {
						"in": 0.36,
						"mm": 9
					},
					"qpf_night": {
						"in": 0.36,
						"mm": 9
					},
					"snow_allday": {
						"in": 0,
						"cm": 0
					},
					"snow_day": {
						"in": 0,
						"cm": 0
					},
					"snow_night": {
						"in": 0,
						"cm": 0
					},
					"maxwind": {
						"mph": 15,
						"kph": 24,
						"dir": "SSW",
						"degrees": 203
					},
					"avewind": {
						"mph": 10,
						"kph": 16,
						"dir": "SSW",
						"degrees": 203
					},
					"avehumidity": 74,
					"maxhumidity": 0,
					"minhumidity": 0
				}
			]
		}
	}
}
    
}
