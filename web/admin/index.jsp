<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link href="../css/metro-all.css?ver=@@b-version" rel="stylesheet" type="text/css"/>
    <title><% out.print(session.getAttribute("s_nombre_hotel").toString()); %> | Sistema Empleados</title>

</head>
<body class="m4-cloak">
<div class="container">
    <div class="example">
        <div class="window">
            <div class="window-caption">
                <span class="icon mif-windows"></span>
                <span class="title"><% out.print(session.getAttribute("s_nombre_hotel").toString()); %> | Ericak Ramirez</span>
                <div class="buttons">
                    <span class="btn-min"></span>
                    <span class="btn-max"></span>
                    <span class="btn-close"></span>
                </div>
            </div>
            <nav data-role="ribbonmenu">
                <ul class="tabs-holder">
                    <li class="static"><a href="#">File</a></li>
                    <li class="active"><a href="#section_main">Main</a></li>
                    <li><a href="#section_buttons">Buttons</a></li>
                    <li><a href="#section_inputs">Inputs</a></li>
                </ul>

                <div class="content-holder">

                    <div class="section" id="section_main">
                        <div class="group">
                            <button class="ribbon-button"><span class="icon"><span class="mif-share"></span></span><span class="caption">Share</span></button>
                            <button class="ribbon-button"><span class="icon"><span class="mif-envelop"></span></span><span class="caption">Email</span></button>
                            <div>
                                <button class="ribbon-button dropdown-toggle">
                                    <span class="icon">
                                        <span class="mif-file-zip fg-cyan"></span>
                                    </span>
                                    <span class="caption">Compress</span>
                                </button>
                                <ul class="ribbon-dropdown" data-role="dropdown" data-duration="100">
                                    <li class="checked"><a href="#">Modification</a></li>
                                    <li class="checked"><a href="#">Type</a></li>
                                    <li class="checked"><a href="#">Size</a></li>
                                    <li><a href="#">Creating</a></li>
                                    <li><a href="#">Authors</a></li>
                                    <li class="checked-one"><a href="#">Tags</a></li>
                                    <li><a href="#">Names</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">Columns...</a></li>
                                </ul>
                            </div>

                            <div class="group-divider"></div>

                            <div class="pl-1 pr-1 d-flex flex-column">
                                <button class="ribbon-tool-button">
                                    <span class="mif-location"></span>
                                </button>
                                <div>
                                    <button class="ribbon-tool-button dropdown-toggle">
                                        <span class="mif-alarm fg-red"></span>
                                    </button>
                                    <ul class="ribbon-dropdown" data-role="dropdown" data-duration="100">
                                        <li class="checked"><a href="#">Modification</a></li>
                                        <li class="checked"><a href="#">Type</a></li>
                                        <li class="checked"><a href="#">Size</a></li>
                                        <li><a href="#">Creating</a></li>
                                        <li><a href="#">Authors</a></li>
                                        <li class="checked-one"><a href="#">Tags</a></li>
                                        <li><a href="#">Names</a></li>
                                        <li class="divider"></li>
                                        <li><a href="#">Columns...</a></li>
                                    </ul>
                                </div>
                            </div>

                            <div class="group-divider"></div>

                            <div class="ribbon-split-button">
                                <button class="ribbon-main">
                                    <span class="icon">
                                        <span class="mif-cogs"></span>
                                    </span>
                                </button>
                                <span class="ribbon-split dropdown-toggle">Options</span>
                                <ul class="ribbon-dropdown" data-role="dropdown" data-duration="100">
                                    <li class="checked"><a href="#">Modification</a></li>
                                    <li class="checked"><a href="#">Type</a></li>
                                    <li class="checked"><a href="#">Size</a></li>
                                    <li><a href="#">Creating</a></li>
                                    <li><a href="#">Authors</a></li>
                                    <li class="checked-one"><a href="#">Tags</a></li>
                                    <li><a href="#">Names</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">Columns...</a></li>
                                </ul>
                            </div>

                            <div class="group-divider"></div>

                            <div class="d-flex flex-column">
                                <button class="ribbon-icon-button" disabled>
                                    <span class="icon">
                                        <span class="mif-apple"></span>
                                    </span>
                                    <span class="caption">Apple</span>
                                </button>

                                <div>
                                    <button class="ribbon-icon-button dropdown-toggle">
                                        <span class="icon">
                                            <span class="mif-apps"></span>
                                        </span>
                                        <span class="caption">Apps</span>
                                    </button>
                                    <ul class="ribbon-dropdown" data-role="dropdown">
                                        <li class="checked"><a href="#">Modification</a></li>
                                        <li class="checked"><a href="#">Type</a></li>
                                        <li class="checked"><a href="#">Size</a></li>
                                        <li disabled><a href="#">Creating</a></li>
                                        <li><a href="#">Authors</a></li>
                                        <li class="checked-one"><a href="#">Tags</a></li>
                                        <li><a href="#">Names</a></li>
                                        <li class="divider"></li>
                                        <li>
                                            <a href="#" class="dropdown-toggle">Columns...</a>
                                            <ul class="ribbon-dropdown" data-role="dropdown">
                                                <li><a href="#">Creating</a></li>
                                                <li><a href="#">Authors</a></li>
                                                <li><a href="#">Names</a></li>
                                            </ul>
                                        </li>
                                    </ul>
                                </div>
                            </div>

                            <div class="ribbon-toggle-group">
                                <button class="ribbon-icon-button" disabled>
                                    <span class="icon">
                                        <span class="mif-list"></span>
                                    </span>
                                    <span class="caption">List</span>
                                </button>

                                <button class="ribbon-icon-button disabled">
                                    <span class="icon">
                                        <span class="mif-apps"></span>
                                    </span>
                                    <span class="caption">Content</span>
                                </button>

                                <button class="ribbon-icon-button">
                                    <span class="icon">
                                        <span class="mif-table"></span>
                                    </span>
                                    <span class="caption">Icons</span>
                                </button>

                                <button class="ribbon-icon-button">
                                    <span class="icon">
                                        <span class="mif-image"></span>
                                    </span>
                                    <span class="caption">Small icons</span>
                                </button>

                                <button class="ribbon-icon-button">
                                    <span class="icon">
                                        <span class="mif-images"></span>
                                    </span>
                                    <span class="caption">Large icons</span>
                                </button>

                                <button class="ribbon-icon-button">
                                    <span class="icon">
                                        <span class="mif-windows"></span>
                                    </span>
                                    <span class="caption">Tiles</span>
                                </button>
                            </div>
                            <span class="title">ribbon controls</span>
                        </div>
                    </div>
                </div>
            </nav>
            <div class="window-content p-2">
                Window content
            </div>
        </div>
    </div>

</div>

<script src="../js/metro.js?ver=@@b-version" type="text/javascript"></script>
<script>
</script>
</body>
</html>
