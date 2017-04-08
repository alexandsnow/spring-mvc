<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href=${request.getContextPath()}/css/normalize.css>
    <link rel="stylesheet" href=${request.getContextPath()}/css/elements-ui.css>
    <title>Daniella</title>
</head>
<body>
    <div class="content">
        <el-row>
            <el-col :span="24">{{message}}</el-col>
        </el-row>
        <el-row>
            <el-col :span="4">
                <el-menu default-active="2" class="el-menu-vertical-demo">
                    <el-submenu index="1">
                        <template slot="title"><i class="el-icon-message"></i>导航一</template>
                        <el-menu-item-group>
                            <template slot="title">分组一</template>
                            <el-menu-item index="1-1">选项1</el-menu-item>
                            <el-menu-item index="1-2">选项2</el-menu-item>
                        </el-menu-item-group>
                        <el-menu-item-group title="分组2">
                            <el-menu-item index="1-3">选项3</el-menu-item>
                        </el-menu-item-group>
                        <el-submenu index="1-4">
                            <template slot="title">选项4</template>
                            <el-menu-item index="1-4-1">选项1</el-menu-item>
                        </el-submenu>
                    </el-submenu>
                    <el-menu-item index="2"><i class="el-icon-menu"></i>导航二</el-menu-item>
                    <el-menu-item index="3"><i class="el-icon-setting"></i>导航三</el-menu-item>
                </el-menu>
            </el-col>
            <el-col :span="20"><div class="grid-content bg-purple-light">Content</div></el-col>
        </el-row>


    </div>
</body>

<script src=${request.getContextPath()}/js/vue.js></script>
<script src=${request.getContextPath()}/js/elementUI.js></script>
<script src=${request.getContextPath()}/js/app.js></script>
</html>