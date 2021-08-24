# TODO 修改为你的项目/库名称

> TODO 添加你的项目/库描述

> [中文文档](./README_CN.md) (TODO 移除本行，以及 README_CN.md 这个文档)

## 环境

+ Windows 10
+ Java 8
+ IDEA 2021.2

## 模块

+ TODO 添加你自己的模块描述

## 使用方法 (TODO 开发完成之后删除本节)

+ pom.xml
  + 查找所有的 TODO
  + 修改 GAV
  + 修改 artifact 名称
  + 修改联系方式
  + (Optional) 如果需要，修改 JDK 版本
  + 修改 distribution
+ src/main/java
  + 包 `com.example.artifact` 修改为你自己的包
  + 子包名 `modulename` 修改为你自己的包
  + (Optional) 添加你自己的模块
  + 参考 `com.example.artifact.modulename.ExampleUtil` 实现你自己的库
+ src/test/java
  + 包 `com.example.artifact` 修改为你自己的包
  + 子包名 `modulename` 修改为你自己的包
  + 参考 `com.example.artifact.modulename.ExampleUtilTest` 实现你自己的库的单元测试
+ 设置本地 maven 的发布配置
  + (Optional if already have) 安装一个基于 nexus 或者 jfrog 的 maven 服务器，并且获得发布的账号密码
  + (Optional if already installed) 安装好本地的 maven
  + (Optional if already set) 在 $HOME/.m2/ 下添加或者修改  settings.xml, 增加 <settings> 部分
    + servers xml 配置
      ```xml
      <servers>
          <server>
              <id>repo-releases</id>
              <username>username</username>
              <password>password</password>
          </server>
          <server>
              <id>repo-snapshots</id>
              <username>username</username>
              <password>password</password>
          </server>
      
          <!-- if using private key, follow this
          <server>
              <id>siteServer</id>
              <privateKey>/path/to/private/key</privateKey>
              <passphrase>optional; leave empty if not used.</passphrase>
          </server>
          -->
      </servers>
      ```
    + 注意: 上面的 `server.id` 例如 repo-releases，必须和 pom.xml distributionManagement -> `repository.id` 保持一致

  + 完整的 $HOME/.m2/settings.xml 样例
        
    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    <settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">

      <!-- TODO change me -->
      <localRepository>\path\to\your\home\.m2\repository</localRepository>

      <interactiveMode>true</interactiveMode>

      <offline>false</offline>
      
      <!-- TODO change your own id and authorities -->
      <servers>
        <server>
          <id>repo-releases</id>
          <username>username</username>
          <password>password</password>
        </server>
        <server>
          <id>repo-snapshots</id>
          <username>username</username>
          <password>password</password>
        </server>
      </servers>

      <!-- TODO change your own maven repo addr -->
      <mirrors>
        <mirror>
          <id>private-mirror</id>
          <mirrorOf>central</mirrorOf>
          <name>Example Private Maven Repo</name>
          <url>https://mvn.example.com/content/groups/public/</url>
        </mirror>
      </mirrors>

    </settings>
    ```

+ 发布
  + `mvn clean deploy`

## Git 提交规范

- `feat` 增加新功能
- `fix` 修复问题/BUG
- `style` 代码风格相关无影响运行结果的
- `perf` 优化/性能提升
- `refactor` 重构
- `revert` 撤销修改
- `test` 测试相关
- `docs` 文档/注释
- `chore` 依赖更新/脚手架配置修改等
- `workflow` 工作流改进
- `ci` 持续集成
- `types` 类型定义文件更改
- `wip` 开发中
