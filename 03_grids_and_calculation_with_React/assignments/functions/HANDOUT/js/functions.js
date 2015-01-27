/** @jsx React.DOM */

/* This is a simple button which put up an alert. Property: title. */
var MyButton = React.createClass({
    render: function () {
        return <span><button style={{width: "40px"}}
                             onClick={(function() { alert(this.props.title); }).bind(this)}
                             type="button">{this.props.title}</button></span>;
    }
});

/* Coloured square. Properties: r, g, b, width, height. */
var MyBox = React.createClass({
    render: function() {
        var r = this.props.r;
        var g = this.props.g;
        var b = this.props.b;
        return <div style={{display: 'inline-block',
                            backgroundColor: 'rgb(' + r + ', ' + g + ', ' + b + ')',
                            width: this.props.width + "px",
                            height: this.props.height + "px"}} />;
    }
});

/* Straight map from number to button with that number. */
function makeButton(n) {
    return <MyButton title={n} />;
}

function makeRed(n) {
    return <MyBox r={n * 16} g="0" b="0" width="40" height="20" />;
}

// Range: 1000
function sinMonoFn(n) {
    var s = Math.sin(n * Math.PI * 2 / 1000);

    return <MyBox r="255" g="128" b="0" width="1" height={40 * (s + 1)} />;
}

var Block = React.createClass({
    render: function() {
        // Simple mappings: 16 items, generated with index 0..15:
        var sixteenButtons = _.range(16).map(makeButton);
        var sixteenReds = _.range(16).map(makeRed);
        var sinsMono = _.range(1000).map(sinMonoFn);

        return <div className="pad">
            <div>{sixteenButtons}</div>
            <div>{sixteenReds}</div>
            <div>{sinsMono}</div>
        </div>;
    }
});

var mountedContent = React.renderComponent(<Block />,
                                           document.getElementById("container"));
