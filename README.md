# 介绍

```shell
├── resources                       # 静态资源加载目录
│   └── jenkinsfile                 # 主流程定义
├── src
│   └── com
│       └── piper
│           └── Constants.groovy    # 常用的方法定义，如编码，解码
│           └── Utils.groovy        # 常用的工具库
└── vars                            # 全局函数目录
    ├── pipeBuild.groovy            # 定义构建相关逻辑
    ├── pipeCheck.groovy            # 定义检查相关逻辑
    ├── pipeDeploy.groovy           # 定义部署相关逻辑
    ├── pipeLog.groovy              # 定义日志相关逻辑
    ├── pipeStage.groovy            # 定义阶段相关逻辑
    ├── pipeTest.groovy             # 定义测试相关逻辑
    └── pipeTrigger.groovy          # 流程入
```

