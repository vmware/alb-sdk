<div class="product-ext-content">
<h1 id="overview">Overview</h1>
<p>This manual covers VMware Avi Load Balancer RESTful Application Programming Interface (API) guide.</p>
<h2 id="http-headers">HTTP Headers</h2>
<p>Avi Controller REST APIs uses HTTP Headers and cookies for authentication, denoting content type, ordering, filtering, pagination, etc.</p>
<h3 id="request-headers">Request Headers</h3>
<hr />
<table style="border-collapse: collapse; border-style: solid; width: 100%;" border="1" cellspacing="2" cellpadding="5">
<thead>
<tr style="background-color: #95a5a6;">
<th style="background-color: #ced4d9; border-color: #95a5a6; border-style: solid; width: 9.40877%;">Name</th>
<th style="background-color: #ced4d9; border-color: #95a5a6; border-style: solid; width: 7.56419%;">Mandatory</th>
<th style="background-color: #ced4d9; border: 1px solid #95a5a6; width: 69.1046%;">Description</th>
<th style="background-color: #ced4d9; border-color: #95a5a6; border-style: solid; width: 13.9224%;">Usage</th>
</tr>
</thead>
<tbody>
<tr>
<td style="border-style: solid; width: 9.40877%;">Content-Type</td>
<td style="width: 7.56419%;">Yes</td>
<td style="width: 69.1046%;">Content format. Should be application/json</td>
<td style="width: 13.9224%;">Content-Type: application/json</td>
</tr>
<tr>
<td style="width: 9.40877%;">X-Avi-Version</td>
<td style="width: 7.56419%;">Yes</td>
<td style="width: 69.1046%;">API version to use for the API call. Avi controller supports all the API version which is less than equal to the version of the Controller. In order to use a feature that is released in a version, eg. 17.2.7, the API version should be greater than or equal to 17.2.7. It is important to remember that API version determines the version of the API data. As best practice, users once users have performed integration with a controller and API version then they should keep using it till they tested integration with the new API Version.</td>
<td style="width: 13.9224%;">X-Avi-Version: 18.1.2</td>
</tr>
<tr>
<td style="width: 9.40877%;">X-Avi-Tenant</td>
<td style="width: 7.56419%;">No</td>
<td style="width: 69.1046%;">Tenant context. If not present, default tenant for user is used</td>
<td style="width: 13.9224%;">X-Avi-Tenant: acme</td>
</tr>
<tr>
<td style="width: 9.40877%;">Authorization</td>
<td style="width: 7.56419%;">Yes</td>
<td style="width: 69.1046%;">Encoded Auth credentials in Base64 or authenticated sessionid cookie is mandatory</td>
<td style="width: 13.9224%;">Authorization: Basic yjfsdnj984498</td>
</tr>
<tr>
<td style="width: 9.40877%;">X-CSRFToken</td>
<td style="width: 7.56419%;">Yes</td>
<td style="width: 69.1046%;">CSRF Token for POST/PUT. Use from csrftoken cookie</td>
<td style="width: 13.9224%;">X-CSRFToken: hdsbf84r34FFI39nvd398</td>
</tr>
<tr>
<td style="width: 9.40877%;">Referer</td>
<td style="width: 7.56419%;">Yes NB: Mandatory for POST only</td>
<td style="width: 69.1046%;">Parent page</td>
<td style="width: 13.9224%;">Referer: http://10.10.10.10/</td>
</tr>
<tr>
<td style="width: 9.40877%;">Accept-Encoding</td>
<td style="width: 7.56419%;">Yes NB: Mandatory for GET only</td>
<td style="width: 69.1046%;">Requested content format. Should be application/json</td>
<td style="width: 13.9224%;">Accept-Encoding: application/json</td>
</tr>
</tbody>
</table>
<h3>&#160;</h3>
<h3 id="response-headers">Response Headers</h3>
<hr />
<table style="border-collapse: collapse; width: 50%;" border="1" cellspacing="2" cellpadding="5">
<thead>
<tr style="background-color: #95a5a6;">
<th style="background-color: #ced4d9; border-color: #95a5a6; border-style: solid;">Name</th>
<th style="background-color: #ced4d9; border-color: #95a5a6; border-style: solid;">Description</th>
<th style="background-color: #ced4d9; border-color: #95a5a6; border-style: solid;">Format</th>
</tr>
</thead>
<tbody>
<tr>
<td style="border-style: solid;">Content-Type</td>
<td>Content format. Should be application/json</td>
<td>Content-Type: application/json</td>
</tr>
</tbody>
</table>
<h3>&#160;</h3>
<h3 id="response-cookies">Response Cookies</h3>
<hr />
<table style="border-collapse: collapse; width: 50%;" border="1" cellspacing="2" cellpadding="5">
<thead>
<tr style="background-color: #95a5a6;">
<th style="background-color: #ced4d9; border-color: #95a5a6; border-style: solid;">Name</th>
<th style="background-color: #ced4d9; border-color: #95a5a6; border-style: solid;">Description</th>
<th style="background-color: #ced4d9; border-color: #95a5a6; border-style: solid;">Format</th>
</tr>
</thead>
<tbody>
<tr>
<td style="border-style: solid;">csrftoken</td>
<td>Auth Token for session</td>
<td>csrftoken: HF48348nvdvvdhh8</td>
</tr>
<tr>
<td>sessionid</td>
<td>Session ID</td>
<td>sessionid: fdsh734FG578b</td>
</tr>
</tbody>
</table>
<h2>&#160;</h2>
<h2 id="authentication">Authentication</h2>
<p>Avi Controller allows REST API usage using both Basic Authentication (over https) and Session Authentication.</p>
<h3 id="basic-authentication">Basic authentication</h3>
<p>Auth credentials are encoded as Base 64 and sent as the Authorization header in every request. The following example retrieves the cluster version using basic authentication using the requests python library. resp = requests.get(&#8216;https://10.10.1.101/api/cluster/version&#8217;, verify=False, auth=(&#8216;admin&#8217;,&#8216;adminpassword&#8217;))</p>
<h3 id="session-authentication">Session authentication</h3>
<p>The client performs a login to the controller. After authentication, a session is established and the sessionid is passed back to the client as a cookie. The client returns the sessionid cookie for subsequent requests. To end the session, the client performs a logout to the controller with the CSRFToken and controller IP in the headers. The following example retrieves the cluster version after session establishment, and then terminates the session.</p>
<div class="code-toolbar">
<pre class="  language-json" tabindex="0"><code class="  language-json">login = requests.post('https<span class="token operator">:</span><span class="token comment">//10.10.1.101/login', verify=False, data={'username': 'admin', 'password': 'adminpassword'})</span>
resp = requests.get('https<span class="token operator">:</span><span class="token comment">//10.10.1.101/api/cluster/version', verify=False, cookies=dict(sessionid= login.cookies['sessionid']))</span>
logout = requests.post('https<span class="token operator">:</span><span class="token comment">//10.10.1.101/logout', verify=False, headers={'X-CSRFToken': login.cookies['csrftoken'], 'Referer':'https://10.10.1.101'}, cookies=login.cookies)</span>
</code></pre>
<div class="toolbar">
<div class="toolbar-item">&#160;</div>
</div>
</div>
<h2 id="object-tenancy">Object Tenancy</h2>
<p>A tenant is associated with every object. &#8216;admin&#8217; tenant is the default tenant that exists from the beginning.</p>
<p>Users can just access tenants where they have been assigned a role. Each user has a default tenant. &#8216;admin&#8217; user is automatically assigned a role in all tenants. The default tenant for &#8216;admin&#8217; user is &#8216;admin&#8217; tenant.</p>
<p>In order to perform an operation in a tenant that&#8217;s different from the default tenant for that user, use the extension header &#8216;X-Avi-Tenant&#8217; to specify the tenant. If &#8216;X-Avi-Tenant&#8217; isn&#8217;t specified, the operation is performed in the default tenant for that user.</p>
<p>For e.g., when the &#8216;admin&#8217; user performs a GET on /api/pool, without specifying &#8216;X-Avi-Tenant&#8217;, all pools under the &#8216;admin&#8217; tenant are retrieved. When the &#8216;admin&#8217; user performs a GET on /api/pool specifying &#8216;X-Avi-Tenant&#8217; as &#8217;tenant1&#8217;, all pools under &#8217;tenant1&#8217; tenant are retrieved.</p>
<h2 id="object-management">Object management</h2>
<p>REST methods can be used for managing objects in the Avi Controller.</p>
<h3 id="object-retrieval">Object retrieval</h3>
<p>Use the GET method to retrieve one or more objects.</p>
<p>To retrieve all tenants:</p>
<div class="code-toolbar">
<pre class="  language-json" tabindex="0"><code class="  language-json">GET /api/tenant
<span class="token punctuation">{</span>
    count<span class="token operator">:</span> <span class="token number">1</span><span class="token punctuation">,</span>
    results<span class="token operator">:</span> <span class="token punctuation">[</span>
        <span class="token punctuation">{</span>
            &#8220;description&#8221;<span class="token operator">:</span> <span class="token string">""</span><span class="token punctuation">,</span>
            &#8220;url&#8221;<span class="token operator">:</span> <span class="token string">"https://10.10.5.27/api/tenant/admin"</span><span class="token punctuation">,</span>
            &#8220;uuid&#8221;<span class="token operator">:</span> <span class="token string">"admin"</span><span class="token punctuation">,</span>
            &#8220;name&#8221;<span class="token operator">:</span> <span class="token string">"admin"</span><span class="token punctuation">,</span>
            &#8220;local&#8221;<span class="token operator">:</span> <span class="token boolean">true</span><span class="token punctuation">,</span>
            &#8220;config_settings&#8221;<span class="token operator">:</span> <span class="token punctuation">{</span>
                &#8220;tenant_vrf&#8221;<span class="token operator">:</span> <span class="token boolean">false</span><span class="token punctuation">,</span>
                &#8220;tenant_default_profiles&#8221;<span class="token operator">:</span> <span class="token boolean">false</span>
            <span class="token punctuation">}</span>
        <span class="token punctuation">}</span>
    <span class="token punctuation">]</span>
<span class="token punctuation">}</span>
</code></pre>
<div class="toolbar">
<div class="toolbar-item">&#160;</div>
</div>
</div>
<p>To retrieve tenants with uuid &#8216;admin&#8217;:</p>
<div class="code-toolbar">
<pre class="  language-json" tabindex="0"><code class="  language-json">GET /api/tenant/admin


<span class="token punctuation">{</span>
    <span class="token property">"description"</span><span class="token operator">:</span> <span class="token string">""</span><span class="token punctuation">,</span> 
    <span class="token property">"url"</span><span class="token operator">:</span> <span class="token string">"https://10.10.5.27/api/tenant/admin"</span><span class="token punctuation">,</span> 
    <span class="token property">"uuid"</span><span class="token operator">:</span> <span class="token string">"admin"</span><span class="token punctuation">,</span> 
    <span class="token property">"name"</span><span class="token operator">:</span> <span class="token string">"admin"</span><span class="token punctuation">,</span> 
    <span class="token property">"local"</span><span class="token operator">:</span> <span class="token boolean">true</span><span class="token punctuation">,</span> 
    <span class="token property">"config_settings"</span><span class="token operator">:</span> <span class="token punctuation">{</span>
        <span class="token property">"tenant_vrf"</span><span class="token operator">:</span> <span class="token boolean">false</span><span class="token punctuation">,</span> 
        <span class="token property">"tenant_default_profiles"</span><span class="token operator">:</span> <span class="token boolean">false</span>
    <span class="token punctuation">}</span>
<span class="token punctuation">}</span>
</code></pre>
<div class="toolbar">
<div class="toolbar-item">&#160;</div>
</div>
</div>
<h3 id="object-creation">Object creation</h3>
<p>Use the POST method to create an object.</p>
<p>To create a pool:</p>
<div class="code-toolbar">
<pre class="  language-json" tabindex="0"><code class="  language-json">POST /api/pool
<span class="token punctuation">{</span>
            <span class="token property">"description"</span><span class="token operator">:</span> <span class="token string">"my pool"</span><span class="token punctuation">,</span>
            <span class="token property">"name"</span><span class="token operator">:</span> <span class="token string">"pool1"</span><span class="token punctuation">,</span>
            <span class="token property">"servers"</span><span class="token operator">:</span> <span class="token punctuation">[</span>
                <span class="token punctuation">{</span>
                    <span class="token property">"ip"</span><span class="token operator">:</span> <span class="token punctuation">{</span>
                        <span class="token property">"addr"</span><span class="token operator">:</span> <span class="token string">"10.10.1.10"</span><span class="token punctuation">,</span>
                        <span class="token property">"type"</span><span class="token operator">:</span> <span class="token string">"V4"</span>
                    <span class="token punctuation">}</span><span class="token punctuation">,</span>
                    <span class="token property">"port"</span><span class="token operator">:</span> <span class="token number">80</span><span class="token punctuation">,</span>
                <span class="token punctuation">}</span>
            <span class="token punctuation">]</span><span class="token punctuation">,</span>
<span class="token punctuation">}</span>
</code></pre>
<div class="toolbar">
<div class="toolbar-item">&#160;</div>
</div>
</div>
<h3 id="object-modification">Object modification</h3>
<p>Use the PUT method to modify an object.</p>
<p>To modify a pool with uuid &#8216;pool-13df5490-cb95-47f8-b414-c2b37c897ca7&#8217;:</p>
<div class="code-toolbar">
<pre class="  language-json" tabindex="0"><code class="  language-json">PUT /api/pool/pool-13df5490-cb95-47f8-b414-c2b37c897ca7
<span class="token punctuation">{</span>
      <span class="token property">"uuid"</span><span class="token operator">:</span> <span class="token string">"pool-13df5490-cb95-47f8-b414-c2b37c897ca7"</span><span class="token punctuation">,</span>
      <span class="token property">"name"</span><span class="token operator">:</span> <span class="token string">"p1"</span><span class="token punctuation">,</span>
      <span class="token property">"tenant_ref"</span><span class="token operator">:</span> <span class="token string">"https://10.10.1.101/api/tenant/admin"</span><span class="token punctuation">,</span>
      <span class="token property">"servers"</span><span class="token operator">:</span> <span class="token punctuation">[</span>
        <span class="token punctuation">{</span>
            <span class="token property">"ip"</span><span class="token operator">:</span> <span class="token punctuation">{</span>
                <span class="token property">"type"</span><span class="token operator">:</span> <span class="token string">"V4"</span><span class="token punctuation">,</span>
                <span class="token property">"addr"</span><span class="token operator">:</span> <span class="token string">"10.10.10.10"</span>
            <span class="token punctuation">}</span><span class="token punctuation">,</span>
            <span class="token property">"enabled"</span><span class="token operator">:</span> <span class="token boolean">true</span>
        <span class="token punctuation">}</span><span class="token punctuation">,</span>
        <span class="token punctuation">{</span>
            <span class="token property">"ip"</span><span class="token operator">:</span> <span class="token punctuation">{</span>
                <span class="token property">"type"</span><span class="token operator">:</span> <span class="token string">"V4"</span><span class="token punctuation">,</span>
                <span class="token property">"addr"</span><span class="token operator">:</span> <span class="token string">"10.10.10.11"</span>
            <span class="token punctuation">}</span><span class="token punctuation">,</span>
            <span class="token property">"enabled"</span><span class="token operator">:</span> <span class="token boolean">true</span>
        <span class="token punctuation">}</span>
    <span class="token punctuation">]</span>
<span class="token punctuation">}</span>
</code></pre>
<div class="toolbar">
<div class="toolbar-item">&#160;</div>
</div>
</div>
<h3 id="object-deletion">Object deletion</h3>
<p>Use the DELETE method to delete an object.</p>
<p>To delete a pool with uuid &#8216;pool-13df5490-cb95-47f8-b414-c2b37c897ca7&#8217;:</p>
<div class="code-toolbar">
<pre class="  language-json" tabindex="0"><code class="  language-json">DELETE /api/pool/pool-13df5490-cb95-47f8-b414-c2b37c897ca7
</code></pre>
<div class="toolbar">
<div class="toolbar-item">&#160;</div>
</div>
</div>
<h2 id="response-codes">Response codes</h2>
<p>Avi Controller returns the following response codes.</p>
<h3 id="2xx-response-codes">2xx response codes</h3>
<p>These response codes are associated with a successful operation.</p>
<table style="border-collapse: collapse; width: 40%;" border="1" cellspacing="2" cellpadding="5">
<thead>
<tr style="background-color: #95a5a6; height: 44.7812px;">
<th style="background-color: #ced4d9; border-color: #95a5a6; border-style: solid; width: 26.8615%; height: 44.7812px;">Response code</th>
<th style="background-color: #ced4d9; border-color: #95a5a6; border-style: solid; width: 66.7426%; height: 44.7812px;">Description</th>
</tr>
</thead>
<tbody>
<tr style="height: 22.3906px;">
<td style="border-style: solid; width: 26.8615%; height: 22.3906px;">200</td>
<td style="border-style: solid; width: 66.7426%; height: 22.3906px;">OK - Success</td>
</tr>
<tr style="height: 22.3906px;">
<td style="border-style: solid; width: 26.8615%; height: 22.3906px;">201</td>
<td style="border-style: solid; width: 66.7426%; height: 22.3906px;">CREATED &#8211; Successful object creation</td>
</tr>
<tr style="height: 22.3906px;">
<td style="border-style: solid; width: 26.8615%; height: 22.3906px;">204</td>
<td style="border-style: solid; width: 66.7426%; height: 22.3906px;">NO CONTENT &#8211; Successfully completed</td>
</tr>
</tbody>
</table>
<h3 id="3xx-response-codes">3xx response codes</h3>
<p>These response codes are used for redirection.</p>
<table style="border-collapse: collapse; width: 40%;" border="1" cellspacing="2" cellpadding="5">
<thead>
<tr style="background-color: #95a5a6;">
<th style="background-color: #ced4d9; border-color: #95a5a6; border-style: solid;">Response code</th>
<th style="background-color: #ced4d9; border-color: #95a5a6; border-style: solid;">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td style="border-style: solid;">302</td>
<td style="border-style: solid;">REDIRECT &#8211; Indicates client should use new URL</td>
</tr>
</tbody>
</table>
<h3 id="4xx-response-codes">4xx response codes</h3>
<p>These response codes indicate an error.</p>
<table style="border-collapse: collapse; width: 40%;" border="1" cellspacing="2" cellpadding="5">
<thead>
<tr style="background-color: #95a5a6;">
<th style="background-color: #ced4d9; border-color: #95a5a6; border-style: solid;">Response code</th>
<th style="background-color: #ced4d9; border-color: #95a5a6; border-style: solid;">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td style="border-style: solid;">400</td>
<td style="border-style: solid;">BAD REQUEST &#8211; Content is incorrect</td>
</tr>
<tr>
<td style="border-style: solid;">401</td>
<td style="border-style: solid;">NOT AUTHORIZED &#8211; Authentication failure</td>
</tr>
<tr>
<td style="border-style: solid;">404</td>
<td style="border-style: solid;">NOT FOUND &#8211; Object doesn&#8217;t exist</td>
</tr>
<tr>
<td style="border-style: solid;">405</td>
<td style="border-style: solid;">METHOD NOT ALLOWED &#8211; Incorrect method on object</td>
</tr>
</tbody>
</table>
<h3 id="5xx-response-codes">5xx response codes</h3>
<p>These response codes indicate a server error.</p>
<table style="border-collapse: collapse; width: 40%;" border="1" cellspacing="2" cellpadding="5">
<thead>
<tr style="background-color: #95a5a6;">
<th style="background-color: #ced4d9; border-color: #95a5a6; border-style: solid;">Response code</th>
<th style="background-color: #ced4d9; border-color: #95a5a6; border-style: solid;">Description</th>
</tr>
</thead>
<tbody>
<tr>
<td style="border-style: solid;">500</td>
<td style="border-style: solid;">SERVER ERROR &#8211; Internal server error</td>
</tr>
<tr>
<td style="border-style: solid;">503</td>
<td style="border-style: solid;">INITIALIZING &#8211; Avi Controller is not ready</td>
</tr>
</tbody>
</table>
<h2>&#160;</h2>
<h2 id="filtering-sorting-paging">Filtering, sorting, paging</h2>
<p>The following sections explain how to filter, sort and page objects.</p>
<h3 id="filtering">Filtering</h3>
<p>To filter a pool by name:</p>
<div class="code-toolbar">
<pre class="  language-json" tabindex="0"><code class="  language-json">GET /api/pool?name=pool1
<span class="token punctuation">{</span>
    <span class="token property">"count"</span><span class="token operator">:</span> <span class="token number">1</span><span class="token punctuation">,</span>
    <span class="token property">"results"</span><span class="token operator">:</span> <span class="token punctuation">[</span>
        <span class="token punctuation">{</span>
            <span class="token property">"url"</span><span class="token operator">:</span> <span class="token string">"https://10.10.1.101/api/pool/pool-4afa32c7-6835-4c46-b602-de6d1e9e4d7c"</span><span class="token punctuation">,</span>
            <span class="token property">"uuid"</span><span class="token operator">:</span> <span class="token string">"pool-4afa32c7-6835-4c46-b602-de6d1e9e4d7c"</span><span class="token punctuation">,</span>
            <span class="token property">"name"</span><span class="token operator">:</span> <span class="token string">"pool1"</span><span class="token punctuation">,</span>
            <span class="token property">"server_count"</span><span class="token operator">:</span> <span class="token number">1</span><span class="token punctuation">,</span>
            <span class="token property">"tenant_ref"</span><span class="token operator">:</span> <span class="token string">"https://10.10.1.101/api/tenant/admin"</span><span class="token punctuation">,</span>
            <span class="token property">"lb_algorithm"</span><span class="token operator">:</span> <span class="token string">"LB_ALGORITHM_LEAST_CONNECTIONS"</span><span class="token punctuation">,</span>
            <span class="token property">"use_service_port"</span><span class="token operator">:</span> <span class="token boolean">false</span><span class="token punctuation">,</span>
            <span class="token property">"inline_health_monitor"</span><span class="token operator">:</span> <span class="token boolean">true</span><span class="token punctuation">,</span>
            <span class="token property">"default_server_port"</span><span class="token operator">:</span> <span class="token number">80</span><span class="token punctuation">,</span>
            <span class="token property">"max_concurrent_connections_per_server"</span><span class="token operator">:</span> <span class="token number">0</span><span class="token punctuation">,</span>
            <span class="token property">"graceful_disable_timeout"</span><span class="token operator">:</span> <span class="token number">1</span><span class="token punctuation">,</span>
            <span class="token property">"connection_ramp_duration"</span><span class="token operator">:</span> <span class="token number">10</span><span class="token punctuation">,</span>
            <span class="token property">"servers"</span><span class="token operator">:</span> <span class="token punctuation">[</span>
                <span class="token punctuation">{</span>
                    <span class="token property">"hostname"</span><span class="token operator">:</span> <span class="token string">"10.10.10.10"</span><span class="token punctuation">,</span>
                    <span class="token property">"ratio"</span><span class="token operator">:</span> <span class="token number">1</span><span class="token punctuation">,</span>
                    <span class="token property">"ip"</span><span class="token operator">:</span> <span class="token punctuation">{</span>
                        <span class="token property">"type"</span><span class="token operator">:</span> <span class="token string">"V4"</span><span class="token punctuation">,</span>
                        <span class="token property">"addr"</span><span class="token operator">:</span> <span class="token string">"10.10.10.10"</span>
                    <span class="token punctuation">}</span><span class="token punctuation">,</span>
                    <span class="token property">"enabled"</span><span class="token operator">:</span> <span class="token boolean">true</span><span class="token punctuation">,</span>
                <span class="token punctuation">}</span>
            <span class="token punctuation">]</span><span class="token punctuation">,</span>
            <span class="token property">"pd_action_type"</span><span class="token operator">:</span> <span class="token string">"POOL_DOWN_ACTION_CLOSE_CONN"</span><span class="token punctuation">,</span>
        <span class="token punctuation">}</span>
    <span class="token punctuation">]</span>
<span class="token punctuation">}</span>
</code></pre>
<div class="toolbar">
<div class="toolbar-item">&#160;</div>
</div>
</div>
<h3 id="sorting">Sorting</h3>
<p>To sort a pool by name (in ascending order):</p>
<div class="code-toolbar">
<pre class="  language-json" tabindex="0"><code class="  language-json">GET /api/pool?sort=name
<span class="token punctuation">{</span>
    <span class="token property">"count"</span><span class="token operator">:</span> <span class="token number">1</span><span class="token punctuation">,</span>
    <span class="token property">"results"</span><span class="token operator">:</span> <span class="token punctuation">[</span>
        <span class="token punctuation">{</span>
            <span class="token property">"url"</span><span class="token operator">:</span> <span class="token string">"https://10.10.1.101/api/pool/pool-4afa32c7-6835-4c46-b602-de6d1e9e4d7c"</span><span class="token punctuation">,</span>
            <span class="token property">"uuid"</span><span class="token operator">:</span> <span class="token string">"pool-4afa32c7-6835-4c46-b602-de6d1e9e4d7c"</span><span class="token punctuation">,</span>
            <span class="token property">"name"</span><span class="token operator">:</span> <span class="token string">"pool1"</span><span class="token punctuation">,</span>
            <span class="token property">"server_count"</span><span class="token operator">:</span> <span class="token number">1</span><span class="token punctuation">,</span>
            <span class="token property">"tenant_ref"</span><span class="token operator">:</span> <span class="token string">"https://10.10.1.101/api/tenant/admin"</span><span class="token punctuation">,</span>
            <span class="token property">"lb_algorithm"</span><span class="token operator">:</span> <span class="token string">"LB_ALGORITHM_LEAST_CONNECTIONS"</span><span class="token punctuation">,</span>
            <span class="token property">"use_service_port"</span><span class="token operator">:</span> <span class="token boolean">false</span><span class="token punctuation">,</span>
            <span class="token property">"inline_health_monitor"</span><span class="token operator">:</span> <span class="token boolean">true</span><span class="token punctuation">,</span>
            <span class="token property">"default_server_port"</span><span class="token operator">:</span> <span class="token number">80</span><span class="token punctuation">,</span>
            <span class="token property">"max_concurrent_connections_per_server"</span><span class="token operator">:</span> <span class="token number">0</span><span class="token punctuation">,</span>
            <span class="token property">"graceful_disable_timeout"</span><span class="token operator">:</span> <span class="token number">1</span><span class="token punctuation">,</span>
            <span class="token property">"connection_ramp_duration"</span><span class="token operator">:</span> <span class="token number">10</span><span class="token punctuation">,</span>
            <span class="token property">"servers"</span><span class="token operator">:</span> <span class="token punctuation">[</span>
                <span class="token punctuation">{</span>
                    <span class="token property">"hostname"</span><span class="token operator">:</span> <span class="token string">"10.10.10.10"</span><span class="token punctuation">,</span>
                    <span class="token property">"ratio"</span><span class="token operator">:</span> <span class="token number">1</span><span class="token punctuation">,</span>
                    <span class="token property">"ip"</span><span class="token operator">:</span> <span class="token punctuation">{</span>
                        <span class="token property">"type"</span><span class="token operator">:</span> <span class="token string">"V4"</span><span class="token punctuation">,</span>
                        <span class="token property">"addr"</span><span class="token operator">:</span> <span class="token string">"10.10.10.10"</span>
                    <span class="token punctuation">}</span><span class="token punctuation">,</span>
                    <span class="token property">"enabled"</span><span class="token operator">:</span> <span class="token boolean">true</span><span class="token punctuation">,</span>
                <span class="token punctuation">}</span>
            <span class="token punctuation">]</span><span class="token punctuation">,</span>
            <span class="token property">"pd_action_type"</span><span class="token operator">:</span> <span class="token string">"POOL_DOWN_ACTION_CLOSE_CONN"</span><span class="token punctuation">,</span>
        <span class="token punctuation">}</span>
    <span class="token punctuation">]</span>
<span class="token punctuation">}</span>
</code></pre>
<div class="toolbar">
<div class="toolbar-item">&#160;</div>
</div>
</div>
<p>To sort a pool by name (in descending order):</p>
<div class="code-toolbar">
<pre class="  language-json" tabindex="0"><code class="  language-json">GET /api/pool?sort=-name
</code></pre>
<div class="toolbar">
<div class="toolbar-item">&#160;</div>
</div>
</div>
<h3 id="paging">Paging</h3>
<p>To retrive pools in a specific page with a specific page size:</p>
<div class="code-toolbar">
<pre class="  language-json" tabindex="0"><code class="  language-json">GET /api/pool?page_size=<span class="token number">1</span>&amp;page=<span class="token number">2</span>
<span class="token punctuation">{</span>
    <span class="token property">"count"</span><span class="token operator">:</span> <span class="token number">10</span><span class="token punctuation">,</span>
    <span class="token property">"next"</span><span class="token operator">:</span> <span class="token string">"https://10.10.1.101/api/pool?page=3&amp;page_size=1"</span><span class="token punctuation">,</span>
    <span class="token property">"results"</span><span class="token operator">:</span> <span class="token punctuation">[</span>
        <span class="token punctuation">{</span>
            <span class="token property">"url"</span><span class="token operator">:</span> <span class="token string">"https://10.10.1.101/api/pool/pool-4afa32c7-6835-4c46-b602-de6d1e9e4d7c"</span><span class="token punctuation">,</span>
            <span class="token property">"uuid"</span><span class="token operator">:</span> <span class="token string">"pool-4afa32c7-6835-4c46-b602-de6d1e9e4d7c"</span><span class="token punctuation">,</span>
            <span class="token property">"name"</span><span class="token operator">:</span> <span class="token string">"pool1"</span><span class="token punctuation">,</span>
            <span class="token property">"server_count"</span><span class="token operator">:</span> <span class="token number">1</span><span class="token punctuation">,</span>
            <span class="token property">"tenant_ref"</span><span class="token operator">:</span> <span class="token string">"https://10.10.1.101/api/tenant/admin"</span><span class="token punctuation">,</span>
            <span class="token property">"lb_algorithm"</span><span class="token operator">:</span> <span class="token string">"LB_ALGORITHM_LEAST_CONNECTIONS"</span><span class="token punctuation">,</span>
            <span class="token property">"use_service_port"</span><span class="token operator">:</span> <span class="token boolean">false</span><span class="token punctuation">,</span>
            <span class="token property">"inline_health_monitor"</span><span class="token operator">:</span> <span class="token boolean">true</span><span class="token punctuation">,</span>
            <span class="token property">"default_server_port"</span><span class="token operator">:</span> <span class="token number">80</span><span class="token punctuation">,</span>
            <span class="token property">"max_concurrent_connections_per_server"</span><span class="token operator">:</span> <span class="token number">0</span><span class="token punctuation">,</span>
            <span class="token property">"graceful_disable_timeout"</span><span class="token operator">:</span> <span class="token number">1</span><span class="token punctuation">,</span>
            <span class="token property">"connection_ramp_duration"</span><span class="token operator">:</span> <span class="token number">10</span><span class="token punctuation">,</span>
            <span class="token property">"servers"</span><span class="token operator">:</span> <span class="token punctuation">[</span>
                <span class="token punctuation">{</span>
                    <span class="token property">"hostname"</span><span class="token operator">:</span> <span class="token string">"10.10.10.10"</span><span class="token punctuation">,</span>
                    <span class="token property">"ratio"</span><span class="token operator">:</span> <span class="token number">1</span><span class="token punctuation">,</span>
                    <span class="token property">"ip"</span><span class="token operator">:</span> <span class="token punctuation">{</span>
                        <span class="token property">"type"</span><span class="token operator">:</span> <span class="token string">"V4"</span><span class="token punctuation">,</span>
                        <span class="token property">"addr"</span><span class="token operator">:</span> <span class="token string">"10.10.10.10"</span>
                    <span class="token punctuation">}</span><span class="token punctuation">,</span>
                    <span class="token property">"enabled"</span><span class="token operator">:</span> <span class="token boolean">true</span><span class="token punctuation">,</span>
                <span class="token punctuation">}</span>
            <span class="token punctuation">]</span><span class="token punctuation">,</span>
            <span class="token property">"pd_action_type"</span><span class="token operator">:</span> <span class="token string">"POOL_DOWN_ACTION_CLOSE_CONN"</span><span class="token punctuation">,</span>
        <span class="token punctuation">}</span>
    <span class="token punctuation">]</span>
<span class="token punctuation">}</span>
</code></pre>
<div class="toolbar">
<div class="toolbar-item">&#160;</div>
</div>
</div>
<h3 id="retrieving-specific-fields">Retrieving specific fields</h3>
<p>To retrieve specific fields in the response, use query &#8216;?fields=field1,field2,field3&#8217;.</p>
<div class="code-toolbar">
<pre class="  language-json" tabindex="0"><code class="  language-json">GET /api/pool?fields=name<span class="token punctuation">,</span>servers<span class="token punctuation">,</span>lb_algorithm
<span class="token punctuation">{</span>
    <span class="token property">"count"</span><span class="token operator">:</span> <span class="token number">10</span><span class="token punctuation">,</span>
    <span class="token property">"results"</span><span class="token operator">:</span> <span class="token punctuation">[</span>
        <span class="token punctuation">{</span>
            <span class="token property">"name"</span><span class="token operator">:</span> <span class="token string">"pool1"</span><span class="token punctuation">,</span>
           <span class="token property">"lb_algorithm"</span><span class="token operator">:</span> <span class="token string">"LB_ALGORITHM_LEAST_CONNECTIONS"</span><span class="token punctuation">,</span>
          <span class="token property">"servers"</span><span class="token operator">:</span> <span class="token punctuation">[</span>
                <span class="token punctuation">{</span>
                    <span class="token property">"hostname"</span><span class="token operator">:</span> <span class="token string">"10.10.10.10"</span><span class="token punctuation">,</span>
                    <span class="token property">"ratio"</span><span class="token operator">:</span> <span class="token number">1</span><span class="token punctuation">,</span>
                    <span class="token property">"ip"</span><span class="token operator">:</span> <span class="token punctuation">{</span>
                        <span class="token property">"type"</span><span class="token operator">:</span> <span class="token string">"V4"</span><span class="token punctuation">,</span>
                        <span class="token property">"addr"</span><span class="token operator">:</span> <span class="token string">"10.10.10.10"</span>
                    <span class="token punctuation">}</span><span class="token punctuation">,</span>
                    <span class="token property">"enabled"</span><span class="token operator">:</span> <span class="token boolean">true</span><span class="token punctuation">,</span>
                <span class="token punctuation">}</span>
            <span class="token punctuation">]</span><span class="token punctuation">,</span>
        <span class="token punctuation">}</span>
    <span class="token punctuation">]</span>
<span class="token punctuation">}</span></code></pre>
<div class="toolbar">
<div class="toolbar-item">&#160;</div>
<div class="toolbar-item">
<div>
<div id="content" class="highlighter-context page view" data-inline-comments-target="true" data-testid="page-content-only">
<div class="_1bsb1osq _19pkidpf _2hwx1wug _otyridpf _18u01wug">
<div class="css-1plnads e5xcnr80" data-test-appearance="full-width" data-testid="pageContentRendererTinyRendererTestId">
<div id="content" class="page view" data-testid="TinyMCEClientRendererTestId">
<div id="main-content" class="wiki-content" data-inline-comments-target="true">
<h2 id="QueryParametersandFilters-Filters">Filters</h2>
<div class="table-wrap">
<table class="relative-table wrapped confluenceTable" style="border-collapse: collapse; width: 100%; height: 1173.92px;" border="1px" cellspacing="2" cellpadding="5"><colgroup><col style="width: 8.64041%;" /><col style="width: 45.3621%;" /><col style="width: 26.2389%;" /><col style="width: 19.695%;" /></colgroup>
<tbody>
<tr style="height: 54.3906px;">
<th class="confluenceTh" style="background-color: #ced4d9; height: 54.3906px; border: 1px solid #95a5a6;">Filter</th>
<th class="confluenceTh" style="background-color: #ced4d9; height: 54.3906px; border: 1px solid #95a5a6;">Description</th>
<th class="confluenceTh" style="background-color: #ced4d9; height: 54.3906px; border: 1px solid #95a5a6;">
<p>Example</p>
</th>
<th class="confluenceTh" style="background-color: #ced4d9; height: 54.3906px; border: 1px solid #95a5a6;">Response</th>
</tr>
<tr style="height: 67.1719px;">
<td class="confluenceTd" style="height: 67.1719px; border-style: solid; border-width: 1px;">Based on field value</td>
<td class="confluenceTd" style="height: 67.1719px; border-style: solid; border-width: 1px;">The objects can be queried after applying a filter based on the value of a particular field of the object. .(dot) can be used for fields that are nested in other fields. This filter is most commonly used for fetching an object based on its name. Multiple fields can be searched using &amp;.</td>
<td class="confluenceTd" style="height: 67.1719px; border-style: solid; border-width: 1px;"><code>/api/pool?fail_action.type=FAIL_ACTION_CLOSE_CONN</code></td>
<td class="confluenceTd" style="height: 67.1719px; border-style: solid; border-width: 1px;">Pool objects with&#160;<code>fail_action</code>&#160;as&#160;<code>{type: "FAIL_ACTION_CLOSE_CONN"}</code></td>
</tr>
<tr style="height: 54.3906px;">
<td class="confluenceTd" style="height: 54.3906px; border-style: solid; border-width: 1px;">
<p><code>name.contains</code></p>
</td>
<td class="confluenceTd" style="height: 54.3906px; border-style: solid; border-width: 1px;">This filter returns the objects with name that contains the parameter. This is a case sensitive search.</td>
<td class="confluenceTd" style="height: 54.3906px; border-style: solid; border-width: 1px;"><code>/api/pool?name.contains=pool-</code></td>
<td class="confluenceTd" style="height: 54.3906px; border-style: solid; border-width: 1px;">Pool objects that contain&#160;<code>pool-</code>&#160;in their name (like&#160;<code>mypool-01</code>).</td>
</tr>
<tr style="height: 54.3906px;">
<td class="confluenceTd" style="height: 54.3906px; border-style: solid; border-width: 1px;">
<p><code>name.icontains</code></p>
</td>
<td class="confluenceTd" style="height: 54.3906px; border-style: solid; border-width: 1px;">This filter returns the objects with name that contains the parameter. This is a case insensitive search</td>
<td class="confluenceTd" style="height: 54.3906px; border-style: solid; border-width: 1px;"><code>/api/pool?name.icontains=pool-</code></td>
<td class="confluenceTd" style="height: 54.3906px; border-style: solid; border-width: 1px;">Pool objects that contain&#160;<code>pool-</code>&#160;in their name (like&#160;<code>MyPool-01</code>) (case insensitive).</td>
</tr>
<tr style="height: 76.75px;">
<td class="confluenceTd" style="height: 76.75px; border-style: solid; border-width: 1px;">
<p><code>name.in</code></p>
</td>
<td class="confluenceTd" style="height: 76.75px; border-style: solid; border-width: 1px;">This filter returns the objects with name that contains the parameter. Each value for this parameter is to comma separated.</td>
<td class="confluenceTd" style="height: 76.75px; border-style: solid; border-width: 1px;">/api/pool?name.in=pool-1,pool-12</td>
<td class="confluenceTd" style="height: 76.75px; border-style: solid; border-width: 1px;">
<p>Pool objects with name pool-1 or pool-12.</p>
</td>
</tr>
<tr style="height: 76.7812px;">
<td class="confluenceTd" style="height: 76.7812px; border-style: solid; border-width: 1px;">
<p><code>uuid.in</code></p>
</td>
<td class="confluenceTd" style="height: 76.7812px; border-style: solid; border-width: 1px;">This filter returns the objects with uuid that contains the parameter. Each value for this parameter is to comma separated.</td>
<td class="confluenceTd" style="height: 76.7812px; border-style: solid; border-width: 1px;">/api/pool?uuid.in=&lt;uuid-1&gt;,&lt;uuid-2&gt;</td>
<td class="confluenceTd" style="height: 76.7812px; border-style: solid; border-width: 1px;">
<p>Pool objects with uuid&#160;<code>&lt;uuid-1&gt;</code>&#160;or&#160;<code>&lt;uuid-2&gt;</code>.</p>
</td>
</tr>
<tr style="height: 67.1719px;">
<td class="confluenceTd" style="height: 211.125px; border-style: solid; border-width: 1px;" rowspan="3"><code>search</code>
<p>&#160;</p>
</td>
<td class="confluenceTd" style="height: 67.1719px; border-style: solid; border-width: 1px;">This filter returns all objects that contains the search string as value for any of its fields.</td>
<td class="confluenceTd" style="height: 67.1719px; border-style: solid; border-width: 1px;"><code>/api/pool?search=LEAST_CONN</code></td>
<td class="confluenceTd" style="height: 67.1719px; border-style: solid; border-width: 1px;">All Pool objects with&#160;LEAST_CONN&#160;appearing anywhere in any of their fields.</td>
</tr>
<tr style="height: 99.1719px;">
<td class="confluenceTd" style="height: 99.1719px; border-style: solid; border-width: 1px;">
<p>The search filter can also be used to search under a specific field. This is achieved by sending the parameter in the format: ?search=(&lt;field&gt;,&lt;value&gt;)|(&lt;field&gt;,&lt;value&gt;). Incremental search is available for the value part.</p>
</td>
<td class="confluenceTd" style="height: 99.1719px; border-style: solid; border-width: 1px;"><code>/api/pool?search=(name,vs-pool-)</code></td>
<td class="confluenceTd" style="height: 99.1719px; border-style: solid; border-width: 1px;">All Pool objects with name starting with&#160;<code>vs-pool-</code></td>
</tr>
<tr style="height: 44.7812px;">
<td class="confluenceTd" style="height: 44.7812px; border-style: solid; border-width: 1px;">The search filter can also be used to filter depending on the existence of a field. This follows the above pattern with the second item of the tuple left empty: ?search=(&lt;field&gt;,)|(&lt;field&gt;,)</td>
<td class="confluenceTd" style="height: 44.7812px; border-style: solid; border-width: 1px;"><code>/api/pool?search=(<span class="legacy-color-text-default">server_count</span>,)</code></td>
<td class="confluenceTd" style="height: 44.7812px; border-style: solid; border-width: 1px;">Pools that have the field&#160;<code><span class="legacy-color-text-default">server_count</span></code>&#160;with them.</td>
</tr>
<tr style="height: 67.1719px;">
<td class="confluenceTd" style="height: 67.1719px; border-style: solid; border-width: 1px;"><code>isearch</code></td>
<td class="confluenceTd" style="height: 67.1719px; border-style: solid; border-width: 1px;">This filter is used to search case&#160;<em>insensitive</em>&#160;values under a specific field.&#160;This is achieved by sending the parameter in the format: ?isearch=(&lt;field&gt;,&lt;value&gt;)|(&lt;field&gt;,&lt;value&gt;).&#160;Incremental search is available for the value part.</td>
<td class="confluenceTd" style="height: 67.1719px; border-style: solid; border-width: 1px;"><code>/api/pool?isearch=(name,Vs-Pool-)</code></td>
<td class="confluenceTd" style="height: 67.1719px; border-style: solid; border-width: 1px;">All Pool objects with name starting with all case permutations of&#160;<code>vs-pool-</code></td>
</tr>
<tr style="height: 111.953px;">
<td class="confluenceTd" style="height: 111.953px; border-style: solid; border-width: 1px;" colspan="1"><code>referred_by</code></td>
<td class="confluenceTd" style="height: 111.953px; border-style: solid; border-width: 1px;" colspan="1">This filter returns all objects that are referred by the given objects in parameters. The parameter needs to be sent as<code>&#160;?referred_by=&lt;obj_type&gt;:&lt;obj_uuid&gt;,&lt;obj_type&gt;:&lt;obj_uuid&gt;</code>.&#160;Special parameters 'any'/'none' can be used as obj_uuid to filter at least one/no refs of obj_type.<br />Also 'any:none'/'any:any' can be used to get objects being referred by no objects/referred by at least one object of any type.</td>
<td class="confluenceTd" style="height: 111.953px; border-style: solid; border-width: 1px;" colspan="1"><code>/api/pool?referred_by=virtualservice:&lt;uuid&gt;</code></td>
<td class="confluenceTd" style="height: 111.953px; border-style: solid; border-width: 1px;" colspan="1">Pools that are referred by the vs with uuid &lt;uuid&gt;</td>
</tr>
<tr style="height: 134.344px;">
<td class="confluenceTd" style="height: 134.344px; border-style: solid; border-width: 1px;"><code>refers_to</code></td>
<td class="confluenceTd" style="height: 134.344px; border-style: solid; border-width: 1px;">This filter returns all objects that refers to the given objects in parameters. The parameter needs to be sent as&#160;<code>?refers_to=&lt;obj_type&gt;:&lt;obj_uuid&gt;,&lt;obj_type&gt;:&lt;obj_uuid&gt;</code>. Add&#160;<code>depth</code>&#160;parameter to specify the depth to which the relation needs to be checked. Special parameters 'any'/'none' can be used as obj_uuid to filter at least one/no refs of obj_type.<br />Also 'any:none'/'any:any' can be used to get objects referring to no objects/referring to at least one object of any type.</td>
<td class="confluenceTd" style="height: 134.344px; border-style: solid; border-width: 1px;"><code>/api/virtualservice?refers_to=pool:&lt;uuid&gt;&amp;depth=1</code></td>
<td class="confluenceTd" style="height: 134.344px; border-style: solid; border-width: 1px;">VS objects that directly refers to pool with uuid &lt;uuid&gt;</td>
</tr>
<tr style="height: 54.3906px;">
<td class="confluenceTd" style="height: 54.3906px; border-style: solid; border-width: 1px;" colspan="1">
<p><code>cloud_ref.uuid</code></p>
</td>
<td class="confluenceTd" style="height: 54.3906px; border-style: solid; border-width: 1px;" colspan="1">This filter is used to filter objects with their cloud ref.</td>
<td class="confluenceTd" style="height: 54.3906px; border-style: solid; border-width: 1px;" colspan="1"><code>/api/pool?cloud_ref.uuid=&lt;uuid&gt;</code></td>
<td class="confluenceTd" style="height: 54.3906px; border-style: solid; border-width: 1px;" colspan="1">Pool objects with their cloud ref uuid as&#160;<code>&lt;uuid&gt;.</code></td>
</tr>
<tr style="height: 76.75px;">
<td class="confluenceTd" style="height: 76.75px; border-style: solid; border-width: 1px;" colspan="1"><code>limit_by</code></td>
<td class="confluenceTd" style="height: 76.75px; border-style: solid; border-width: 1px;" colspan="1">This filter the number of objects in the response data.</td>
<td class="confluenceTd" style="height: 76.75px; border-style: solid; border-width: 1px;" colspan="1"><code>/api/pool?limit_by=3</code></td>
<td class="confluenceTd" style="height: 76.75px; border-style: solid; border-width: 1px;" colspan="1">
<p>First three pool objects from the queryset.</p>
</td>
</tr>
<tr style="height: 44.75px;">
<td class="confluenceTd" style="height: 44.75px; border-style: solid; border-width: 1px;" colspan="1">
<pre>exclude</pre>
</td>
<td class="confluenceTd" style="height: 44.75px; border-style: solid; border-width: 1px;" colspan="1">This filter excludes the uuid(s) contained in the parameter.&#160;</td>
<td class="confluenceTd" style="height: 44.75px; border-style: solid; border-width: 1px;" colspan="1">
<pre>/api/pool?uuid.in=&lt;uuid-1&gt;,&lt;uuid-2&gt;&amp;exclude=uuid.in</pre>
</td>
<td class="confluenceTd" style="height: 44.75px; border-style: solid; border-width: 1px;" colspan="1">All the pool objects except those in uuid.in</td>
</tr>
<tr style="height: 44.7812px;">
<td class="confluenceTd" style="height: 44.7812px; border-style: solid; border-width: 1px;" colspan="1">label_key</td>
<td class="confluenceTd" style="height: 44.7812px; border-style: solid; border-width: 1px;" colspan="1">This filters filters the response wrt GRBAC marker (label) keys.</td>
<td class="confluenceTd" style="height: 44.7812px; border-style: solid; border-width: 1px;" colspan="1">/api/pool/?label_key=app</td>
<td class="confluenceTd" style="height: 44.7812px; border-style: solid; border-width: 1px;" colspan="1">All pools with GRBAC labels having key as "app"</td>
</tr>
<tr style="height: 44.7812px;">
<td class="confluenceTd" style="height: 44.7812px; border-style: solid; border-width: 1px;" colspan="1">label_value</td>
<td class="confluenceTd" style="height: 44.7812px; border-style: solid; border-width: 1px;" colspan="1">This filter filters the response wrt GRBAC marker (label) values.</td>
<td class="confluenceTd" style="height: 44.7812px; border-style: solid; border-width: 1px;" colspan="1">/api/pool/?label_value=green</td>
<td class="confluenceTd" style="height: 44.7812px; border-style: solid; border-width: 1px;" colspan="1">All pools with GRBAC labels having "green" as one of the values.</td>
</tr>
</tbody>
</table>
</div>
<h3>&#160;</h3>
<h3 id="QueryParametersandFilters-AdditionalParameters">Additional Parameters</h3>
<div class="table-wrap">
<table class="relative-table wrapped confluenceTable tablesorter tablesorter-default" style="border-collapse: collapse; width: 100%; height: 391px;" role="grid" border="1px" cellspacing="2" cellpadding="5"><colgroup><col style="width: 9.47235%;" /><col style="width: 42.0216%;" /><col style="width: 17.1011%;" /><col style="width: 31.3414%;" /></colgroup>
<thead>
<tr class="tablesorter-headerRow" role="row">
<th class="confluenceTh tablesorter-header sortableHeader tablesorter-headerUnSorted" style="background-color: #ced4d9; border: 1px solid #95a5a6;" tabindex="0" role="columnheader" scope="col" data-column="0" aria-disabled="false" aria-sort="none" aria-label="Parameter: No sort applied, activate to apply an ascending sort">Parameter</th>
<th class="confluenceTh tablesorter-header sortableHeader tablesorter-headerUnSorted" style="background-color: #ced4d9; border: 1px solid #95a5a6;" tabindex="0" role="columnheader" scope="col" data-column="1" aria-disabled="false" aria-sort="none" aria-label="Description: No sort applied, activate to apply an ascending sort">Description</th>
<th class="confluenceTh tablesorter-header sortableHeader tablesorter-headerUnSorted" style="background-color: #ced4d9; border: 1px solid #95a5a6;" tabindex="0" role="columnheader" scope="col" data-column="2" aria-disabled="false" aria-sort="none" aria-label="Example: No sort applied, activate to apply an ascending sort">Example</th>
<th class="confluenceTh tablesorter-header sortableHeader tablesorter-headerUnSorted" style="background-color: #ced4d9; border: 1px solid #95a5a6;" tabindex="0" role="columnheader" scope="col" data-column="3" aria-disabled="false" aria-sort="none" aria-label="Response: No sort applied, activate to apply an ascending sort">Response</th>
</tr>
</thead>
<tbody aria-live="polite" aria-relevant="all">
<tr role="row">
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">
<p><code>sort</code></p>
</td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">This parameter is used to sort the results w.r.t a field.</td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;"><code>/api/pool?sort=name</code></td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">All pool objects with pools appearing in alphabetic order</td>
</tr>
<tr role="row">
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">
<p><code>fields</code></p>
</td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">This filter allows user to specify the fields that need to be fetched by the request. If multiple fields are required, they need to be comma separated.</td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;"><code>/api/pool?fields=fail_action,cloud_ref</code></td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">All pool objects with&#160;<code>fail_action</code>&#160;and&#160;<code>cloud_ref</code>&#160;fields along with other general fields (uuid, name, url, ..).</td>
</tr>
<tr role="row">
<td class="confluenceTd" style="border-style: solid; border-width: 1px;"><code>include_name</code></td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">If this parameter is set, all referred fields will have their name appended as&#160;<code>&lt;object&gt;_ref:&lt;uuid&gt;#&lt;name&gt;</code></td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;"><code><span class="nolink">/api/pool?include_name</span></code></td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">All pool objects with referred fields with name appended to it.</td>
</tr>
<tr role="row">
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">
<p><code>skip_default</code></p>
</td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">This parameter can be used to skip fields with value same as its default value.</td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;"><code>/api/pool?skip_default=True</code></td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">
<p>All pool objects without fields that are holding their default values.</p>
</td>
</tr>
<tr role="row">
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">
<p>Parameters for Pagination</p>
</td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;"><code>page_size</code>&#160;is used to specify the maximum number of results to be returned per page. It can be any integer from 1 to 200.&#160;<code>page</code>&#160;specifies the index of the page for displaying paginated results.</td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">-</td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">-</td>
</tr>
</tbody>
</table>
</div>
<h3>&#160;</h3>
<h3 id="KeyChangein3122"><span style="color: #c2185b;">Key Change in 31.2.2</span></h3>
<ul>
<li>Handling duplicate query parameters in an Avi API call has been changed in version 31.2.2. Consider this example <code>/api/pool?fields=name&amp;fields=uuid</code> to understand the change in this behavior:</li>
</ul>
<div class="table-wrap">
<table class="relative-table wrapped confluenceTable" style="border-collapse: collapse; width: 100%; border: 1px solid #95a5a6;" border="1" cellspacing="2" cellpadding="5">
<thead>
<tr>
<th class="confluenceTh" style="background-color: #ced4d9; border: 1px solid #95a5a6; width: 15%;">Versions</th>
<th class="confluenceTh" style="background-color: #ced4d9; border: 1px solid #95a5a6; width: 50%;">Behavior</th>
<th class="confluenceTh" style="background-color: #ced4d9; border: 1px solid #95a5a6; width: 35%;">Example</th>
</tr>
</thead>
<tbody>
<tr>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">30.2.1+<br />31.1.1+<br />31.2.1</td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">When an API call had duplicate query parameters, only the first occurrence of the repeated parameter was evaluated, ignoring all other occurrences.</td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">Only the first occurrence (<em>fields=name</em>) is evaluated.</td>
</tr>
<tr>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">31.2.2</td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">When an API call has duplicate query parameters, only the last occurrence is evaluated, and all earlier occurrences are ignored.</td>
<td class="confluenceTd" style="border-style: solid; border-width: 1px;">Only the last occurrence (<em>fields=uuid</em>) is evaluated.</td>
</tr>
</tbody>
</table>
</div>
<p>To include multiple values for a query parameter, specify them as a comma-separated list: <em>fields=name,uuid</em>.</p>
</div>
<div data-test-id="tinymce-editor-loaded">&#160;</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>