/*(function() {
	var i = {
		VER : "1.0.0",
		CDN : "http://pub.idqqimg.com/qconn/widget/loader/"
	}, g = {
		SHARE_QQ : "shareqq.js?t=20131115001",
		IFRAME_SHARE_QQ : "messenger.js?t=20140423001"
	}, h = "";
	(function() {
		for (var e, c = /connect\.qq\.com\/widget\/shareqq\/loader\/loader\.js/i, d = document
				.getElementsByTagName("script"), a = 0, f, j = d.length; a < j; a++) {
			f = d[a];
			if ((f.src || "").match(c)) {
				e = f;
				break
			}
		}
		e = e;
		c = [];
		var b;
		for (d = 0; d < e.attributes.length; d++) {
			a = e.attributes[d];
			a.name != "src" && a.specified
					&& c.push([ a.name, '"' + a.value + '"' ].join("="));
			if (a.name == "widget" && a.specified) {
				if (a.value == "IFRAME_SHARE_QQ")
					h = "iframe";
				b = g[a.value] || g.SHARE_QQ
			}
		}
		b = h == "iframe" ? "http://pub.idqqimg.com/qconn/widget/shareqq/js/"
				+ b : i.CDN + b;
		c.push("src=" + b + "");
		b = b;
		if (document.readyState != "complete")
			document.write("<script " + c.join(" ") + " ><\/script>");
		else {
			c = document.createElement("script");
			c.type = "text/javascript";
			c.src = b;
			(b = document.getElementsByTagName("head")) && b[0]
					&& b[0].appendChild(c)
		}
	})()
})();
*/