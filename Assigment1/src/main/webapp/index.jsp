<%--
  Created by IntelliJ IDEA.
  User: phuch
  Date: 11/12/2021
  Time: 12:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <meta name="description" content="admin-themes-lab">
    <meta name="author" content="themes-lab">
    <title>Make Admin Template &amp; Builder</title>

</head>
<body class="fixed-topbar fixed-sidebar theme-sdtl color-default dashboard">
<!--[if lt IE 7]>
<p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->
<div class="page-content page-thin">
    <div class="row">
        <div class="col-xlg-7 col-lg-7">
            <div class="row">
                <div class="col-md-12">
                    <div class="panel bg-dark widget-map">
                        <div class="panel-header">
                            <h3><i class="icon-globe-alt"></i> <strong>Interactif</strong> Map</h3>
                        </div>
                        <div class="panel-content widget-full">
                            <div class="row">
                                <div class="col-md-12">
                                    <div id="map"></div>
                                </div>
                                <div class="col-md-3 c-white">
                                    <div id="listdiv"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-xlg-3 col-lg-5 col-visitors">
            <div class="row">
                <div class="col-md-12">
                    <div class="panel no-bd bd-3 panel-stat">
                        <div class="panel-header">
                            <h3><i class="icon-graph"></i> <strong>Visitors</strong> Statistic</h3>
                            <div class="control-btn">
                                <a href="#" class="panel-reload hidden"><i class="icon-reload"></i></a>
                            </div>
                        </div>
                        <div class="panel-body p-15 p-b-0">
                            <div class="row m-b-10">
                                <div class="col-xs-3 big-icon">
                                    <i class="icon-users"></i>
                                </div>
                                <div class="col-xs-9">
                                    <div class="live-tile" data-mode="carousel" data-direction="vertical" data-delay="3500" data-height="60">
                                        <div>
                                            <small class="stat-title">Visits today</small>
                                            <h1 class="f-40 m-0 w-300">25 610</h1>
                                        </div>
                                        <div>
                                            <small class="stat-title">Visits yesterday</small>
                                            <h1 class="f-40 m-0 w-300">22 420</h1>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-6">
                                    <small class="stat-title">New Visitors</small>
                                    <div class="live-tile" data-mode="carousel" data-direction="vertical" data-delay="3500" data-height="23">
                                        <div>
                                            <h3 class="f-20 m-0 w-300">37.5%</h3>
                                        </div>
                                        <div>
                                            <h3 class="f-20 m-0 w-300">34.2%</h3>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <small class="stat-title">Bounce Rate</small>
                                    <div class="live-tile f-right" data-mode="carousel" data-direction="vertical" data-delay="3500" data-height="23">
                                        <div>
                                            <h3 class="f-20 t-right m-0 w-500">5.6%</h3>
                                        </div>
                                        <div>
                                            <h3 class="f-20 t-right m-0 w-500">7.4%</h3>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="panel-stat-chart">
                            <canvas id="visitors-chart"></canvas>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row" style="display:none">
                <div class="col-md-12">
                    <div class="panel no-bd bd-3 panel-stat">
                        <div class="panel-body bg-red p-15">
                            <div class="row m-b-10">
                                <div class="col-xs-3 big-icon">
                                    <i class="icon-equalizer"></i>
                                </div>
                                <div class="col-xs-9">
                                    <small class="stat-title">ORDERS THIS MONTH</small>
                                    <div class="live-tile" data-mode="carousel" data-direction="vertical" data-delay="3500" data-height="56">
                                        <div>
                                            <h1 class="f-40 m-0 w-300">148</h1>
                                        </div>
                                        <div>
                                            <h1 class="f-40 m-0 w-300">+28%</h1>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-xs-6">
                                    <small class="stat-title">Last month</small>
                                    <div class="live-tile" data-mode="carousel" data-direction="vertical" data-delay="3500" data-height="23">
                                        <div>
                                            <h3 class="f-20 m-0 w-300">126</h3>
                                        </div>
                                        <div>
                                            <h3 class="f-20 m-0 w-300">$12,545</h3>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <small class="stat-title">Last week</small>
                                    <div class="live-tile f-right" data-mode="carousel" data-direction="vertical" data-delay="3500" data-height="23">
                                        <div>
                                            <h3 class="t-right f-20 m-0 w-500">43</h3>
                                        </div>
                                        <div>
                                            <h3 class="t-right f-20 m-0 w-500">$4,237</h3>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-xlg-2 hidden-lg col-clock">
            <div class="row">
                <div class="col-md-12">
                    <ul class="jquery-clock small" data-jquery-clock="">
                        <li class="jquery-clock-pin"></li>
                        <li class="jquery-clock-sec"></li>
                        <li class="jquery-clock-min"></li>
                        <li class="jquery-clock-hour"></li>
                    </ul>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <div class="widget-progress-bar">
                        <div class="progress">
                            <progress class="progress-bar-primary stat1" value="82" max="100" data-animation-delay="600"></progress>
                            <div class="progress-info">
                                <span class="progress-name">Profil Complete</span>
                                <span class="progress-value">82%</span>
                            </div>
                        </div>
                        <div class="progress">
                            <progress class="progress-bar-primary stat1" value="43" max="100" data-animation-delay="800"></progress>
                            <div class="progress-info">
                                <span class="progress-name">Answer Emails</span>
                                <span class="progress-value">43%</span>
                            </div>
                        </div>
                        <div class="progress">
                            <progress class="progress-bar-primary stat1" value="93" max="100" data-animation-delay="1000"></progress>
                            <div class="progress-info">
                                <span class="progress-name">Server availability</span>
                                <span class="progress-value">93%</span>
                            </div>
                        </div>
                        <div class="progress">
                            <progress class="progress-bar-primary stat1" value="76" max="100" data-animation-delay="1200"></progress>
                            <div class="progress-info">
                                <span class="progress-name">CPU Usage</span>
                                <span class="progress-value">76%</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-xlg-4 col-financial-stocks">
            <div class="panel">
                <div class="panel-header panel-controls">
                    <h3><i class="icon-graph"></i> <strong>Financial</strong> Stock</h3>
                </div>
                <div class="panel-content widget-full widget-stock stock1">
                    <div class="tabs tabs-linetriangle">
                        <ul class="nav nav-tabs nav-4" role="tablist">
                            <li class="nav-item lines-3" role="tab" data-toggle="tab">
                                <a href="#microsoft-tab" id="microsoft" data-toggle="tab">
                                    <span class="title">Microsoft</span>
                                    <span class="c-gray"><strong>23.32</strong></span>
                                    <span class="c-green">+6.214%</span>
                                </a>
                            </li>
                            <li class="nav-item active lines-3" role="tab" data-toggle="tab">
                                <a href="#sony-tab" id="sony" data-toggle="tab">
                                    <span class="title">Sony</span>
                                    <span class="c-gray"><strong>23.32</strong></span>
                                    <span class="c-red">-8.425%</span>
                                </a>
                            </li>
                            <li class="nav-item lines-3" role="tab" data-toggle="tab">
                                <a href="#samsung-tab"  id="samsung" data-toggle="tab">
                                    <span class="title">Samsung</span>
                                    <span class="c-gray"><strong>23.32</strong></span>
                                    <span class="c-green">+2.035%</span>
                                </a>
                            </li>
                            <li class="nav-item lines-3" role="tab" data-toggle="tab">
                                <a href="#apple-tab"  id="apple" data-toggle="tab">
                                    <span class="title">Apple</span>
                                    <span class="c-gray"><strong>23.32</strong></span>
                                    <span class="c-green">+1.245%</span>
                                </a>
                            </li>
                        </ul>
                        <div class="tab-content">
                            <div role="tabpanel" class="tab-pane" id="microsoft-tab">
                                <div id="stock-microsoft"></div>
                            </div>
                            <div role="tabpanel" class="tab-pane active" id="sony-tab">
                                <div id="stock-sony"></div>
                            </div>
                            <div role="tabpanel" class="tab-pane" id="samsung-tab">
                                <div id="stock-samsung"></div>
                            </div>
                            <div role="tabpanel" class="tab-pane" id="apple-tab">
                                <div id="stock-apple"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-xlg-2 col-small-stats">
            <div class="row">
                <div class="col-xlg-12 col-lg-4 col-sm-4">
                    <div class="panel">
                        <div class="panel-content widget-small bg-green">
                            <div class="title">
                                <h1>Virgin Mobile</h1>
                                <p>Last month trending</p>
                                <span>-8.452%</span>
                            </div>
                            <div class="content">
                                <div id="stock-virgin-sm"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-xlg-12 col-lg-4 col-sm-4">
                    <div class="panel">
                        <div class="panel-content widget-small bg-purple">
                            <div class="title">
                                <h1>Ebay Inc</h1>
                                <p>Last month trending</p>
                                <span>+2.124%</span>
                            </div>
                            <div class="content">
                                <div id="stock-ebay-sm"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-xlg-12 col-lg-4 col-sm-4">
                    <div class="panel">
                        <div class="panel-content widget-small bg-primary">
                            <div class="title">
                                <h1>Facebook Corp.</h1>
                                <p>Last month trending</p>
                                <span>+1.054%</span>
                            </div>
                            <div class="content">
                                <div id="stock-facebook-sm"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-xlg-6">
            <div class="panel">
                <div class="panel-content widget-full widget-stock stock2">
                    <div class="tab_right">
                        <ul class="nav nav-tabs">
                            <li class="lines-3">
                                <a href="#yahoo-tab" id="yahoo" data-toggle="tab" data-color="green" data-value="+6.214%">
                                    <div class="clearfix">
                                        <span class="title pull-left">YHOO</span>
                                        <span class="pull-right">Yahoo Inc</span>
                                    </div>
                                    <div class="clearfix">
                                        <span class="c-gray pull-left"><strong>23.32</strong></span>
                                        <span class="c-green pull-right">+6.214%</span>
                                    </div>
                                </a>
                            </li>
                            <li class="lines-3 active">
                                <a href="#google-tab" id="google" data-toggle="tab" data-color="red" data-value="-8.425%">
                                    <div class="clearfix">
                                        <span class="title pull-left">GOOG</span>
                                        <span class="pull-right">Google Inc</span>
                                    </div>
                                    <div class="clearfix">
                                        <span class="c-gray pull-left"><strong>22.32</strong></span>
                                        <span class="c-red pull-right">-8.425%</span>
                                    </div>
                                </a>
                            </li>
                            <li class="lines-3">
                                <a href="#nokia-tab"  id="nokia" data-toggle="tab" data-color="green" data-value="+2.035%">
                                    <div class="clearfix">
                                        <span class="title pull-left">NOK</span>
                                        <span class="pull-right">Nokia Inc</span>
                                    </div>
                                    <div class="clearfix">
                                        <span class="c-gray pull-left"><strong>25.32</strong></span>
                                        <span class="c-green pull-right">+2.035%</span>
                                    </div>
                                </a>
                            </li>
                            <li class="lines-3">
                                <a href="#htc-tab"  id="htc" data-toggle="tab" data-color="red" data-value="-1.052%">
                                    <div class="clearfix">
                                        <span class="title pull-left">HTC</span>
                                        <span class="pull-right">HTC Inc</span>
                                    </div>
                                    <div class="clearfix">
                                        <span class="c-gray pull-left"><strong>18.96</strong></span>
                                        <span class="c-red pull-right">-1.052%</span>
                                    </div>
                                </a>
                            </li>
                        </ul>
                        <div class="tab-content">
                            <div class="title-stock">
                                <h1>Google Inc</h1>
                                <span class="c-red">-8.425%</span>
                            </div>
                            <div class="tab-pane" id="yahoo-tab" style="display:none">
                                <div id="stock-yahoo"></div>
                                <div class="company-info">Yahoo! Inc. is an American multinational Internet corporation headquartered in Sunnyvale, California. It is globally known for its Web portal, search engine Yahoo Search, and related services.</div>
                            </div>
                            <div class="tab-pane active" id="google-tab">
                                <div id="stock-google"></div>
                                <div class="company-info">Google is a United States-headquartered, multinational corporation specializing in Internet-related services and products. These include online advertising technologies, search, cloud computing, and software.</div>
                            </div>
                            <div class="tab-pane" id="nokia-tab" style="display:none">
                                <div id="stock-nokia"></div>
                                <div class="company-info">Nokia is a Finnish multinational communications and information technology company. Nokia employed 90,000 people across 120 countries, conducts sales in more than 150 countries and reported annual revenues of around ???12.7 billion.</div>
                            </div>
                            <div class="tab-pane" id="htc-tab" style="display:none">
                                <div id="stock-htc"></div>
                                <div class="company-info">HTC Corporation is a Taiwanese manufacturer of smartphones and tablets. Founded in 1997, HTC began designing and manufacturing devices such as mobile phones, touchscreen phones, and PDAs based on Windows Mobile OS.</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

