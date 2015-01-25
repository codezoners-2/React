function sinMonoFn(n) {
    var s = Math.sin(n * Math.PI * 2 / 1000);
    return <MyBox r="255" g="80" b="0" width="1" height={40 + s * 40} />;
}
