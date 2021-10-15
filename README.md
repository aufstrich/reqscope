requests.http

enhtält 2 requests:
/hugo requests wird vom HugoRequestsInterceptor abefangen wird.
dieser liest den x-name header aus uns setzt daten bei einer request scoped bean

/other sollte nicht vom Interceptor verarbeitet werden.
daher sollten auch keine daten gesetzt sein.
dient zum überprüfen ob die bean wirklich request scoped sind.

