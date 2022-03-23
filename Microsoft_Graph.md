# Discover Microsoft Graph
- Microsoft Graph is a REST web API that enables you to access Microsoft Cloud service resources. After you register 
  your app and get authentication tokens for a user or service, you can make requests to the Microsoft Graph API.
- Microsoft Graph is the gateway to data and intelligence in Microsoft 365. It provides a unified programmability model
  that you can use to access the tremendous amount of data in Microsoft 365, Windows 10, and Enterprise Mobility + Security.

In the Microsoft 365 platform, three main components facilitate the access and flow of data:
- The Microsoft Graph API offers a single endpoint, https://graph.microsoft.com. You can use REST APIs or SDKs to 
  access the endpoint. Microsoft Graph also includes a powerful set of services that manage user and device identity,
  access, compliance, security, and help protect organizations from data leakage or loss
- Microsoft Graph connectors work in the incoming direction, delivering data external to the Microsoft cloud into 
  Microsoft Graph services and applications, to enhance Microsoft 365 experiences such as Microsoft Search. Connectors 
  exist for many commonly used data sources such as Box, Google Drive, Jira, and Salesforce
- Microsoft Graph Data Connect provides a set of tools to streamline secure and scalable delivery of Microsoft Graph 
  data to popular Azure data stores. The cached data serves as data sources for Azure development tools that you can 
  use to build intelligent applications

To read from or write to a resource such as a user or an email message: `{HTTP method} https://graph.microsoft.com/{version}/{resource}?{query-parameters}`